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
for(var i=2021;i<2221;i++)
  {
if(i%4==0 && i%100!=0){
   document.write(num*i);
  }
  }
}
</script>

</body>
</html>