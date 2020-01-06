name := "typed-holes-dbg"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0" % "test"
libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.1.0" % "test"
libraryDependencies += "org.scalatestplus" % "scalatestplus-scalacheck_2.13" % "3.1.0.0-RC2" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % "test"
libraryDependencies += "org.jetbrains" % "annotations" % "17.0.0"
libraryDependencies += "com.github.cb372" % "scala-typed-holes_2.13.1" % "0.1.1" % "test"

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-opt:l:inline",
  "-opt-inline-from", "**",
  "-Ypatmat-exhaust-depth", "160"
)
