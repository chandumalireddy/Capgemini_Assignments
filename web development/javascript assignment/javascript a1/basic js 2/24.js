<!DOCTYPE html>
<html>
<body>



<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
const numToSeparate = 12345;

const arrayOfDigits = Array.from(String(numToSeparate), Number);



  document.getElementById("demo").innerHTML = arrayOfDigits;
}
</script>

</body>
</html>