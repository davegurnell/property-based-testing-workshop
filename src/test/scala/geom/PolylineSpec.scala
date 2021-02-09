package geom

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PolylineSpec extends AnyWordSpec with Matchers {

  val square = Polyline(List(
    Coord(0, 0),
    Coord(0, 2),
    Coord(2, 2),
    Coord(2, 0),
    Coord(0, 0)
  ))

  "length" should {
    "return the length of the line" in {
      square.length shouldBe (8)
    }
  }

  "isClosed" should {
    "identify 'closed' shapes" in {
      square.isClosed shouldBe (true)
    }
  }

}
