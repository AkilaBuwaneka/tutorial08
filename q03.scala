package tutorial04

object q03 {
  def main(args: Array[String]){

    var name=List("Benny","Niroshan","Saman","Kumara")
    println(formatNames(name.head)(toUpper))
    println(name(1).head+formatNames(name(1).charAt(1).toString)(toUpper)+name(1).drop(2))
    println(formatNames(name(2))(toLower))
    println(name.last.init+formatNames(name.last.last.toString)(toUpper))
  }

    def toUpper(upper:String):String={
      upper.toUpperCase()
    }

    def toLower(lower:String):String={
      lower.toLowerCase()
    }

    def formatNames(name:String)(formatFunction:String=>String):String={
      formatFunction(name)
    }
}











/*object q03 {
  def main(args: Array[String]) {
    var a=0
    do {
      print("1.toUpper\n2.toLower\n3.formatNames\n4.Exit\n")
      a=scala.io.StdIn.readInt()
      println(a)
      a match {
        case 1 => convert_upper()
        case 2 => convert_lower()
        case 3 => get_formatNames()
      }
    }while(a!=4)
    def toUpper() {
      print("Enter name : ")
      var 
    }
  }
}*/