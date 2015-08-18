//Project Information
name := "actuarius"

description := "Actuarius is a Markdown Processor written in Scala using parser combinators."

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-unchecked"
)

autoCompilerPlugins := true

resolvers += "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/" 

resolvers += "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"

version := "0.2.7-SNAPSHOT"

libraryDependencies ++= {
  Seq(
    "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources(),
    "junit" % "junit" % "4.8.2" % "test"
  )
}

