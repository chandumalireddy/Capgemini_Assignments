<!DOCTYPE html>
<html>
<body>



<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var a = [4, 2,6];
  var b= [3,2,1];

  var c = a.concat(b); 
  c.sort();
  document.getElementById("demo").innerHTML = c;
}
</script>

</body>
</html>

