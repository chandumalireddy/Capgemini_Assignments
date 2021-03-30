<!DOCTYPE html>
<html>
<body>

  <button onclick="myFunction()">click here</button>
  <p id="demo"></p>
  
  <script>
function myFunction() {
  var sum=0;
  var p=1;
  var num = prompt("Please enter number");
for(var i=1;i<num;i++)
  {
    
  p=p*i;
    sum=sum+i;
  }
   document.write(sum);
document.write(p);
}
</script>

</body>
</html>