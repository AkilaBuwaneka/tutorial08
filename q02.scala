package tutorial04

import scala.io.StdIn.readInt

object q02 {
  def main(args: Array[String]) {
    def check_int(value: Int): String = value match {
      case x if x<=0 => "Negative/Zero"
      case x if x%2==0 => "Even"
      case _ => "Odd"
    }
    print("Enter number : ")
    val value=readInt()
    println(s"${value} is ${check_int(value)}")
  }
}