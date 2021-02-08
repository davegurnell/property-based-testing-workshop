package basics

object Password {

  def isStrong(pwd: String): Boolean =
    pwd.length >= 6 &&
      pwd.exists(_.isDigit) &&
      pwd.exists(_.isLower) &&
      pwd.exists(_.isUpper) &&
      !pwd.contains("password")

}
