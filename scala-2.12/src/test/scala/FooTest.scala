import io.github.malyszaryczlowiek.traits.{ComplexClass, Printing}



class FooTest extends  munit.FunSuite {

  test("fooo test") {


    val s = Seq(1,2,3)
    val l = List(3,3,3)

    val tupleSec = for (
      elem1 <- s;
      elem2 <- l
    ) yield {
      (elem1, elem2)
    }

    println(tupleSec)
  }

  test("ComplexClass test"){
    val n = new ComplexClass
    println( n.print )
  }

}
