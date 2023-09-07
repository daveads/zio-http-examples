scalaVersion := "3.3.0"

inThisBuild(
  Seq(
    resolvers +=
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    resolvers +=
      "Sonatype OSS Snapshots 01" at "https://s01.oss.sonatype.org/content/repositories/snapshots"
  )
)

libraryDependencies += "dev.zio" %% "zio-http" % "3.0.0-RC2+78-8780eb95-SNAPSHOT"

Compile / unmanagedSourceDirectories += baseDirectory.value / "src"
