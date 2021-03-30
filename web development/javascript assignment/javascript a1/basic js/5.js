<script>
function lengthOfNonQWords(result)
  {
    var l=0;
    for(var i=0;i<result.length;i++)
      {
        l=l+result[i].length;
      }
    return l;
  }



var test1 = ["stop", "quit", "exit"];
const result = test1.filter(word => !word.includes('q'));
document.write(lengthOfNonQWords(result));
</script>