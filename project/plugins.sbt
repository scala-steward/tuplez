logLevel := Level.Warn

val scalajsVersion = scala.sys.env.getOrElse("SCALAJS_VERSION", "1.5.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalajsVersion)

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.3")

addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.10.0")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")
