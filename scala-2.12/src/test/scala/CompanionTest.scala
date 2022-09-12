import io.github.malyszaryczlowiek.Foo
import io.github.malyszaryczlowiek.companion.Bar
// import io.github.malyszaryczlowiek.companion.Bar

class CompanionTest extends munit.FunSuite {

  test("testing apply and unapply method") {

    val bar: Bar = Bar.apply

    println(bar)

    bar match {
      case b: Bar if b.num == 1L => println(s"pasuje do liczby")
      case b: Bar  => println(s"pasuje do typu")
      case _     => println(s"inny typ")
    }


    val f = new Foo

    f match {
      case f: Foo => println(s"matching foo type")
      case _      => println(s"other foo type")
    }

  }

}
