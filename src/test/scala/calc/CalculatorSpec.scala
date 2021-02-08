package calc

import org.scalacheck.{Arbitrary, Gen}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalculatorSpec extends AnyWordSpec with Matchers {
  val expr = Add(Num(3), Num(4))

  "Calculator.eval" should {
    "eval an addition" in {
      Calculator.eval(Add(Num(3), Num(4))) shouldBe 7
    }

    "eval a subtraction" in {
      Calculator.eval(Sub(Num(3), Num(4))) shouldBe -1
    }

    "eval a multiplication" in {
      Calculator.eval(Mul(Num(3), Num(4))) shouldBe 12
    }

    "eval a division" in {
      Calculator.eval(Div(Num(3), Num(4))) shouldBe 0
    }
  }
}
