ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "2.12.16"

ThisBuild / organization := "io.github.malyszaryczlowiek"
ThisBuild / organizationName := "io.github.malyszaryczlowiek"
ThisBuild / organizationHomepage := Some(url("https://github.com/malyszaryczlowiek/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/malyszaryczlowiek/foo-repo"),
    "scm:git@github.com:malyszaryczlowiek/foo-repo.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "malyszaryczlowiek",
    name  = "RobertPomorski",
    email = "rrpomorski@gmail.com",
    url   = url("https://github.com/malyszaryczlowiek/")
  )
)

// ThisBuild / versionScheme := Some("early-semver")
ThisBuild / description := "Some description about your project."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/malyszaryczlowiek/foo-repo"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true



lazy val root = (project in file("."))
  .settings(
    name             := "foo-repo",
    idePackagePrefix := Some("io.github.malyszaryczlowiek"),
    libraryDependencies ++= Seq(

//      "org.apache.spark" %% "spark-core"           % "3.3.0" % "provided",
//      "org.apache.spark" %% "spark-sql"            % "3.3.0" % "provided",
      // "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.3.0",  //% "provided",

      // For Tests
      "org.scalameta" %% "munit"            % "0.7.29" % Test,
      "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test

    )
  )