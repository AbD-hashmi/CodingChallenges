/*-- Algorithm
1. Split input array and get the dictionary into a variable
2 Run a loop while saving the value of the substring from 0 to index and index to word lenth
3. check if both of them exist in the dictionary at the same time. if not prints not possible --*/

fun main() {
  println(WordSplit(arrayOf("hellocat", "apple,bat,cat,goodbye,hello,yellow,why")))
}

fun WordSplit(strArr: Array<String>): String {

  var dicionary = strArr[1].split(",") 
  var output ="not possible"
  
  for (i in 0 until strArr[0].length){
    var first = strArr[0].substring(0,i) 
    var second = strArr[0].substring(i,strArr[0].length)

    if(dicionary.contains(first) && dicionary.contains(second)){
      output = "$first,$second"
    }
  }
  return output;  
}