package change

object Change {
  def apply(total: Int, coins: Set[Coin]): Option[Map[Coin, Int]] = {
    // `coins` must be in descending numerical order here:
    def loop(total: Int, coins: List[Coin]): Option[Map[Coin, Int]] =
      if (total == 0) {
        Some(Map.empty)
      } else {
        coins match {
          case Nil =>
            None

          case head :: tail =>
            val count = total / head.value
            val remainder = total - (head.value * count)
            loop(remainder, tail).map(_ + (head -> count))
        }
      }

    loop(total, coins.toList.sortBy(coin => -coin.value))
  }
}
