
  <button onclick="myFunction()">click here</button>
  <p id="demo"></p>
  
  <script>
function myFunction() {
  var sum=0;
  var num = prompt("Please enter number");
for(var i=1;i<num;i++)
  {
    if(i%3==0 || i%5==0)
    sum=sum+i;
  }
   document.write(sum);

}
</script>