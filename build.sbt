lazy val root = (project in file("."))
  .settings(
    name := "scala-learning",
    version := "0.1.0",
    scalaVersion := "3.5.0", // or the latest Scala 3 version
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )