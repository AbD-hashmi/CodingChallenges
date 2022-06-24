/* Algorithm
1.Find the largest number in the array and save in a variable
2.Traverse the array again and add the condition to skip the largest number in the array */
fun main() {
    //Second largest number
    println(findSecondLagestNum(arrayOf(1,2,3,4,5,10,15)))
}
fun findSecondLagestNum(arr:Array<Int>):Int{
    var largestnum = 0
    var secondLargest = 0
    for (i in 0 until arr.size){
        largestnum = Math.max(largestnum,arr[i])
    }
    
    for(i in 0 until arr.size){
        if(arr[i] != largestnum){
            secondLargest = Math.max(secondLargest,arr[i])
        }
    }
    //o(n)
    return secondLargest
}