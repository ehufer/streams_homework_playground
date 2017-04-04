name := """minimal-akka-scala-seed"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {

  val akkaVersion = "2.4.14"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,

    "com.typesafe.akka" %% "akka-stream" % akkaVersion,

    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,

    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
     )

}

fork in run := true
