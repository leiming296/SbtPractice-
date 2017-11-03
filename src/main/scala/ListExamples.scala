object ListExamples {

  val fruit: List[String]= List("apples", "oranges", "pears")
  val nums: List[Int]=List(1,2,3,4)
  val diag3: List[List[Int]]= List(List(1,0,0),List(0,2,0),List(0,0,1))
  val empty:List[Int] = List()

  def main(args: Array[String]): Unit={
    println(fruit)
    println(nums)
    println(diag3)
    println(empty)
  }
}
