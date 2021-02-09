package basics

object Password {

  def isValid(pwd: String): Boolean =
    pwd.length < 255 &&
      !pwd.exists(Set(' ', '\t', '\r', '\n').contains)

  def isStrong(pwd: String): Boolean =
    isValid(pwd) &&
      pwd.length >= 6 &&
      pwd.exists(_.isDigit) &&
      pwd.exists(_.isLower) &&
      pwd.exists(_.isUpper) &&
      !pwd.contains("password")

}
