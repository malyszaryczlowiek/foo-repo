ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "2.12.16"

lazy val root = (project in file("."))
  .settings(
    name := "foo-repo",
    idePackagePrefix := Some("com.github.malyszaryczlowiek"),
    libraryDependencies ++= Seq(

//      "org.apache.spark" %% "spark-core"           % "3.3.0" % "provided",
//      "org.apache.spark" %% "spark-sql"            % "3.3.0" % "provided",
      // "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.3.0",  //% "provided",

      // For Tests
      "org.scalameta" %% "munit"            % "0.7.29" % Test,
      "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test

    )
  )