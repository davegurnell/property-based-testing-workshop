package calc

object Calculator {
  def eval(expr: Expr): Int =
    expr match {
      case Add(x, y) => eval(x) + eval(y)
      case Sub(x, y) => eval(x) - eval(y)
      case Mul(x, y) => eval(x) * eval(y)
      case Div(x, y) => eval(x) / eval(y)
      case Num(n)    => n
    }
}
