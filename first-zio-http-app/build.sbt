name := "FirstZioHttpApp"

version := "1.0"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio-http" % "3.0.0-RC2"
)

Compile / unmanagedSourceDirectories += baseDirectory.value / "src"

