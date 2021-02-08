package geom

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CoordSpec extends AnyWordSpec with Matchers {

  "length" should {
    "return sqrt(x*x + y*y)" in {
      Coord(3, 4).length shouldBe (5)
    }
  }

  "Coord + Coord" should {
    "have tests" in {
      pending
    }
  }

  "Coord - Coord" should {
    "have tests" in {
      pending
    }
  }

  "Coord * Double" should {
    "have tests" in {
      pending
    }
  }

}
