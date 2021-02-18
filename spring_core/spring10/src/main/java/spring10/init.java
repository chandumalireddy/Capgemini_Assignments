package spring10;
import javax.annotation.Resource;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class init  implements ApplicationContextAware, BeanNameAware
{
	 private point pointA;
	 private point pointB;
	 private point pointC;
	 private ApplicationContext context = null;
	
	 public void setPointA(point pointA) {
	  this.pointA = pointA;
	 }


	 public void setPointB(point pointB) {
	  this.pointB = pointB;
	 }

	 public void setPointC(point pointC) {
	  this.pointC = pointC;
	 }

	 public void draw()
	 {
	System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
	System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
	System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
	 }

	 public void setApplicationContext(ApplicationContext context) throws BeansException
	 {
	  this.context = context;
	 }

	 public void setBeanName(String beanName)
	 {
	  System.out.println("Bean name is: "+beanName);
	 }
	}