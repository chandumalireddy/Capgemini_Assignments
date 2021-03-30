<!DOCTYPE html>
<html>
<body>



<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
var a=[1,2,3,4,5,6]

for(var i=0;i<2;i++)
{
var b=a[0];
for(var j=1;j<a.length;j++)
{
a[j-1]=a[j];
}
a[a.length-1]=b;
}

  document.getElementById("demo").innerHTML = a;
}
</script>

</body>
</html>