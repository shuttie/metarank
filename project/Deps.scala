import sbt._

object Deps {
  lazy val http4sVersion    = "1.0.0-M23"
  lazy val log4catsVersion  = "1.1.1"
  lazy val scalatestVersion = "3.2.8"
  lazy val circeVersion     = "0.13.0"
  lazy val circeYamlVersion = "0.13.1"
  lazy val fs2Version       = "3.0.2"
  lazy val luceneVersion    = "8.8.2"

  val httpsDeps = Seq(
    "org.http4s" %% "http4s-dsl"          % http4sVersion,
    "org.http4s" %% "http4s-blaze-server" % http4sVersion,
    "org.http4s" %% "http4s-blaze-client" % http4sVersion,
    "org.http4s" %% "http4s-circe"        % http4sVersion
  )
}
