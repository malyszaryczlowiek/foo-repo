package io.github.malyszaryczlowiek
package traits

trait FirstTrait extends Printing {
  println(s"First trait")

  override def print: String = s"im from Firsttrait"
}
