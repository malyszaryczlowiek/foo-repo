package io.github.malyszaryczlowiek
package companion


// Jeśli klasa nie ma ani val ani var w paramterach
// to są one private.
class Bar(val str: String, var num: Long) {
  override def toString: String = s"$str and $num"
}

object Bar {

  def apply: Bar = {
    new Bar("", 0L)
  }

  def apply(str: String): Bar = {
    new Bar(str, 0L)
  }

  def apply(num: Long): Bar = {
    new Bar("", num)
  }

  def apply(tup: (String, Long)): Bar = {
    new Bar(tup._1, tup._2)
  }
  // to nie może być bo dubluje się z powyżsszą klasą
//  def apply(tup: (Long, String)): Bar = {
//    new Bar(tup._2, tup._1)
//  }


  // unapply

  def unapply(bar: Bar): (String, Long) = {
    (bar.str, bar.num)
  }
}
