package basics

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PasswordSpec extends AnyWordSpec with Matchers {

  // Password.isStrong takes a String and returns a Boolean

  // The rules for a "strong" password are:
  // - must be at least 6 characters
  // - must contain at least one digit
  // - must contain at least one lowercase number
  // - must contain at least one uppercase number
  // - must not contain the word "password"

  // Write tests to verify these properties of the method

}
