name := "pdf-parser"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.apache.tika"   % "tika-core"      % "1.5",
  "org.apache.tika"   % "tika-parsers"   % "1.5"
)
