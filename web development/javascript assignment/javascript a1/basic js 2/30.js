<!DOCTYPE html>
<html>
<body>



<script>
var a = "hello everyone";
  const b = a.split(" ");

for(var i=0;i<b.length;i++)
{
var a=b[i].charAt(0);
b[i]=b[i]+a;

b[i]=b[i]+"ay";
}

for(var i=0;i<b.length;i++)
{

document.write(b[i]+" ");
}
</script>

</body>
</html>

