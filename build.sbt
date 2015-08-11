name := "wit.ai"

version := "1.0.0"

scalaVersion := "2.11.7"

sbtVersion := "0.13.8"

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq("com.typesafe.play" %% "play-ws" % "2.4.0")
