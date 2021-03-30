<body>

  <button onclick="myFunction()">click here</button>
  <p id="demo"></p>
  
  <script>
function myFunction() {
  var sum=0;
  var num = prompt("Please enter number");
for(var i=0;i<=num;i++)
  {
    sum=sum+i;
  }
   document.write(sum);

}
</script>

</body>