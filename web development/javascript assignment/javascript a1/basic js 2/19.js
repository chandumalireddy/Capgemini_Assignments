<!DOCTYPE html>
<html>
<body>



<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var a = ["a", "b","c"];
  var b= [1,2,3];

  var c = a.concat(b); 
  document.getElementById("demo").innerHTML = c;
}
</script>

</body>
</html>