object CollectionTest {
	def main(args: Array[String]) {
	  
		/**Parameterize arrays with types 
		 * Arrays are always mutable
		 * greetStrings.update(0,"Hello")
		 * **/
		val greetStrings = new Array[String](3)
		
		greetStrings(0) = "Hello"
		greetStrings(1) = ", "
		greetStrings(2) = "World \n"
		  
		for(i <- 0 to 2)
		  print(greetStrings(i))
		
		/** Use lists 
		 * Lists are always immutable **/
		val oneTwo = List(1,2)
		val threeFour = List(3,4)
		var oneTwoTheeFour = oneTwo ::: threeFour // ::: list concatenation(연속,연관)
		println("" +oneTwo +" and " + threeFour + " were not mutated." )
		println("Thus, "+ oneTwoTheeFour +" is a new list.")
		
		val twoThree = List(2,3)
		val oneTwoThree = 1 :: twoThree	// :: cons 존재하는 list의 시작에 element 추가.
		println(oneTwoThree)
		
		/** Use tuples
		 *  tuples are immutable, but unlike lists, tuples can contain different types of elements.
		 *  Whereas a list might be a List[Int] or a List[String], 
		 *  a tuple could contain both an integer and a string at the same time.
		 *  **/
		
		val pair = (99, "Lufeballons")
		println(pair._1) //Once you have a tuple instatiated, you can access its elements individually with
		// a field or invoke a method.
		println(pair._2)
		
		/** Use sets and maps 
		 * Scala provides mutable and immutable alternatives, but in a different way
		 * For sets and maps, Scala models mutability in the class hierarchy **/
		var jetSet = Set("Boeing", "Airbus") //immutable set
		jetSet += "Lear" // To add a new element to a set, you call + on the set, passing in the new element.
		println(jetSet.contains("Cessna"))
		
		import scala.collection.mutable.Set
		
		val movieSet = Set("Hitch", "Poltergeist")
		movieSet += "Shrek"
		println(movieSet)
		
		import scala.collection.immutable.HashSet
		
		val hashSet = HashSet("Tomatoes", "Chilies")
		println(hashSet + "Coriander")
		
		import scala.collection.mutable.Map
		
		val treasureMap = Map[Int, String]()
		treasureMap += (1 -> "Go to island")
		treasureMap += (2 -> "Find big X on ground")
		treasureMap += (3 -> "Dig.")
		println(treasureMap(2))
		
		val romanNumeral = Map(
		    1 -> "I", 2->"II", 3->"III"
		) //immutable map, no import is necessary
		println(romanNumeral(3))
		    
	}
}