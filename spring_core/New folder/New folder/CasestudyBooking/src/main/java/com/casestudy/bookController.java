package com.casestudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins="http://localhost:4200")
public class bookController {

	RestTemplate resttemplate= new RestTemplate();
	@Autowired
	bookingService b;
	
	@PostMapping("/add")
	public booking addnew(@RequestBody booking n)
	{
	
int a=n.getPassengers().size();
Train t[]=resttemplate.getForObject("http://localhost:8082/train/getTrainNameWithDate/"+n.getTrainname()+"/"+n.getDate(), Train[].class);
resttemplate.put("http://localhost:8082/train/book/"+n.getTrainname()+"/"+n.getDate()+"/"+n.getReservationtype()+"/"+a,booking.class);

int c=0; 

for(Train e:t)
{
	for(reservationType d: e.getReservationVacancy()) {
	  if(d.getType().equals(n.getReservationtype())) { 
	  c=d.getReservations(); 	  
	  } } 
}
if(c>0) {
for(passengerList p:n.getPassengers())
{
	int position=c;
	String seat=Integer.toString(position);
	p.setSeatNo(seat);
	c--;
}
}
else
{
	for(passengerList p:n.getPassengers())
	{
		
		String seat="Waiting";
		p.setSeatNo(seat);
	}
}
		return b.add(n);	
	}
	
	@GetMapping("/all")
	public List<booking> show()
	{
	return b.showall();	
	}
	@GetMapping("/getuser/{username}")
	public List<booking> getbyusername(@PathVariable("username")String username)
	{
	return b.getbyuser(username);	
	}
	@DeleteMapping("/del/{pnr}")
	public void del(@PathVariable("pnr")String pnr)
	{
		booking book=b.getbypnr(pnr);
		int a=book.getPassengers().size();
		resttemplate.put("http://localhost:8082/train/cancel/"+book.getTrainname()+"/"+book.getDate()+"/"+book.getReservationtype()+"/"+a,booking.class);
		
		b.deleteByPnr(pnr);
	}
	@GetMapping("/getpnr/{pnr}")
	public booking getbypnr(@PathVariable("pnr")String pnr)
	{
	return b.getbypnr(pnr);	
	}
	
}
