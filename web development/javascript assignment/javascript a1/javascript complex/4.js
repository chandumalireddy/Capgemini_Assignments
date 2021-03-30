<!DOCTYPE html>
<html>
<body>

  <button onclick="myFunction()">click here</button>
  <p id="demo"></p>
  
  <script>
function myFunction() {
for(var i=0;i<3;i++){
  var num = prompt("Please enter number 1.add \n 2.sub \n3.mul \n4.div \n5.Exponent\n 6.quit");
  if(num==1)
  {
  var a=prompt("enter value");
  var b=prompt("enter value");
  var c=a+b;
  document.write(c);  
}
  if(num==2)
  {
  var a=prompt("enter value");
  var b=prompt("enter value");
  var c=a-b;
  document.write(c);  
}
  if(num==3)
  {
  var a=prompt("enter value");
  var b=prompt("enter value");
  var c=a*b;
  document.write(c);  
}
  if(num==4)
  {
  var a=prompt("enter value");
  var b=prompt("enter value");
  var c=a/b;
  document.write(c);  
}

if(num==5)
{

  var a=prompt("enter value");
  var b=prompt("enter value");
document.write(Math.pow(a,b);
}if(num==1 || num==2 || num==3 || num==4 || num==5){
continue;
}
else{
document.write("invaid input");
break;
}
}
}
</script>

</body>
</html>

