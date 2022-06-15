fun WordSplit(strArr: Array<String>): String {

  // code goes here  
  var dic = strArr[1].split(",")
  var output ="not possible"
  
  for (i in 0 until strArr[0].length){
    var first = strArr[0].substring(0,i)
    var second = strArr[0].substring(i,strArr[0].length)

    if(dic.contains(first) && dic.contains(second)){
      output = "$first,$second"
    }
  }
 
  return output;
  
}

fun main() {
  println(WordSplit(arrayOf("hellocat", "apple,bat,cat,goodbye,hello,yellow,why")))
}