package calc

import org.scalacheck.{Arbitrary, Gen}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalculatorSpec extends AnyWordSpec with Matchers {
  val three = Num(3)
  val four = Num(4)

  "Calculator.eval" should {
    "eval an addition" in {
      Calculator.eval(Add(three, four)) shouldBe 7
    }

    "eval a subtraction" in {
      Calculator.eval(Sub(three, four)) shouldBe -1
    }

    "eval a multiplication" in {
      Calculator.eval(Mul(three, four)) shouldBe 12
    }

    "eval a division" in {
      Calculator.eval(Div(three, four)) shouldBe 0
    }
  }
}
