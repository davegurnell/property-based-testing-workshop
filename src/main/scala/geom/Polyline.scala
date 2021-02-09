package geom

case class Polyline(coords: List[Coord]) {
  def length: Double =
    coords.sliding(2).map { case Seq(a, b) => (b - a).length }.sum

  def isClosed: Boolean =
    coords.head == coords.last
}
