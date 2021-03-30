
  <script>
 function random_item(items)
{
  
return items[Math.floor(Math.random()*items.length)];
}

var items = ["goodday","badday"];
    document.write(random_item(items));
  </script>
  