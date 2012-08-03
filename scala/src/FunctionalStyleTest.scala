object FunctionalStyleTest {
	def main(args: Array[String]) {
		val greetStrings = new Array[String](3)
		
		greetStrings(0) = "Hello"
		greetStrings(1) = ", "
		greetStrings(2) = "World \n"
		
		printArgs(greetStrings)
		
		val res = formatArgs(Array("Zero","One","Two"))
		assert(res == "Zero\nOne\nTwo")
	}
	
	//imperative style
//	def printArgs(args: Array[String]): Unit = {
//	  var i = 0;
//	  while(i < args.length){
//	    println(args(i))
//	    i += 1
//	  }
//	}
	
	//functional style
	//more functional code is clearer, more concise, and less error-prone than the original(more imperative) code.
	def printArgs(args: Array[String]) : Unit = {
	  args.foreach(println)
	}
	
	def formatArgs(args: Array[String]) = args.mkString("\n")
	
}