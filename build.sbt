name := """HelloWorld"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "sorm Scala 2.11 fork" at "http://markusjura.github.io/sorm"
 
libraryDependencies ++= Seq("org.sorm-framework" % "sorm" % "0.4.1")
libraryDependencies ++= Seq("mysql" % "mysql-connector-java" % "5.1.27")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
