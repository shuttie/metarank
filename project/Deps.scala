import sbt._

object Deps {
  lazy val http4sVersion    = "1.0.0-M21"
  lazy val log4catsVersion  = "1.1.1"
  lazy val scalatestVersion = "3.2.9"
  lazy val circeVersion     = "0.13.0"
  lazy val circeYamlVersion = "0.14.0"
  lazy val fs2Version       = "3.0.6"
  lazy val luceneVersion    = "8.8.2"

  val httpsDeps = Seq(
    "org.http4s" %% "http4s-dsl"          % http4sVersion,
    "org.http4s" %% "http4s-blaze-server" % http4sVersion,
    "org.http4s" %% "http4s-blaze-client" % http4sVersion,
    "org.http4s" %% "http4s-circe"        % http4sVersion
  )
}
