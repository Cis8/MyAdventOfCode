ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "my-advent-of-code",
    idePackagePrefix := Some("ema.cis8")
  )
