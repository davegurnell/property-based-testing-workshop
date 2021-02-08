package change

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ChangeSpec extends AnyWordSpec with Matchers {

  "Change.apply" should {
    "calculate the correct change" in {
      val fifty = Coin(50)
      val twenty = Coin(20)
      val ten = Coin(10)
      val five = Coin(5)

      val actual = Change(75, Set(five, ten, twenty, fifty))

      val expected = Some(Map(
        fifty -> 1,
        twenty -> 1,
        ten -> 0,
        five -> 1
      ))

      actual shouldBe expected
    }
  }

}
