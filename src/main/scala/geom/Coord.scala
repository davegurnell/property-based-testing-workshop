package geom

case class Coord(x: Double, y: Double) {
  def +(that: Coord): Coord =
    Coord(this.x + that.x, this.y + that.y)

  def -(that: Coord): Coord =
    Coord(this.x - that.x, this.y - that.y)

  def *(m: Double): Coord =
    Coord(x * m, y * m)

  def length: Double =
    math.sqrt(x * x + y * y)
}
