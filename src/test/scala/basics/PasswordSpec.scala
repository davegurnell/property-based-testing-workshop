package basics

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PasswordSpec extends AnyWordSpec with Matchers {

  // Write some property-based tests for Password.isValid()
  //
  // This method determines whether a password
  // is "valid" for storage in our legacy database:
  //
  // object Password {
  //   def isValid(pws: String): Boolean = ...
  // }
  //
  // Properties of a valid password:
  // - it can't be more than 255 characters long
  // - it can't contain any whitespace, tabs, or newline characters

  // Write some property-based tests for Password.isStrong()
  //
  // This method determines whether a password
  // is a "strong" choice for our system.
  //
  // object Password {
  //   def isStrong(pws: String): Boolean = ...
  // }
  //
  // The rules for a "strong" password are:
  // - must be at least 6 characters
  // - must contain at least one digit
  // - must contain at least one lowercase number
  // - must contain at least one uppercase number
  // - must not contain the word "password"
  // - must be valid

}
