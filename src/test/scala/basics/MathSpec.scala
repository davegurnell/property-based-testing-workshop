package basics

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.scalacheck.Gen

class MathSpec extends AnyWordSpec with Matchers with ScalaCheckDrivenPropertyChecks {

  def absolute(n: Int): Int =
    if (n < 0) -n else n

  "absolute" should {
    "turn a negative into a positive" in {
      val numbers = Gen.negNum[Int]

      absolute(-2) should be > 0
    }

    "leave a positive as-is" in {
      absolute(10) should be(10)
    }
  }

  def isEven(num: Int): Boolean =
    num % 2 == 0

  "isEven" should {
    "recognise an even number" in {
      isEven(2) should be(true)
    }

    "recognise an odd number" in {
      isEven(1) should be(false)
    }
  }

}
