name := """play24-guice-mybatis"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  "org.mybatis" % "mybatis" % "3.3.0",
  "org.mybatis" % "mybatis-guice" % "3.6",
  "com.google.inject.extensions" % "guice-multibindings" % "4.0",

  // Other dependencies not mentioned in the article
  
  // For demonstration purposes we are using a more lightweight DB instead
  "com.h2database" % "h2" % "1.4.188"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Also copy the database file into the final generated zip by `activator dist`
// See http://stackoverflow.com/questions/12231862/how-to-make-play-framework-dist-command-adding-some-files-folders-to-the-final
mappings in Universal ++=
  (baseDirectory.value / "data.mv.db" get) map
    (x => x -> (x.getName))
