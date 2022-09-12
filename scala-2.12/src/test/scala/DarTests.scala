import io.github.malyszaryczlowiek.`case`.Dar


class DarTests extends munit.FunSuite {

  test("testing copy") {

    val d = Dar("s")
    val dd = d.copy(str = "s")
    assert(d == dd)


    val s = "s"
    val ddd = d.copy(str = s)
    assert(d == ddd)
  }


}
