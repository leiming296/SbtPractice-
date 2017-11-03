name := "ScalaPorgrammingPratice"

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"
)