package dotty.tools
package dottydoc

import org.junit.Test
import org.junit.Assert._

class TestSimpleComments extends DottyTest {

  @Test def simpleComment = {
    val source =
      """
      |package scala
      |
      |/** Hello, world! */
      |trait HelloWorld
      """.stripMargin

    checkCompile(source) { doc =>
      val traitCmt = doc
        .packages("scala")
        .children.find(_.path.mkString(".") == "scala.HelloWorld")
        .flatMap(_.comment.map(_.body))
        .get

      assertEquals(traitCmt, "<p>Hello, world!</p>")
    }
  }

}
