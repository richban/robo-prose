import Dependencies._

lazy val mdsebook = RootProject(uri("https://bitbucket.org/modelsteam/mdsebook.git"))

lazy val mdsebookLocalBase = SettingKey[File]("mdsebookLocalBase",
    "local base direcotry for mdsebook")
mdsebookLocalBase := loadedBuild.value.units(mdsebook.build).localBase

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "dk.itu.dsl.roboprose",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "robo-prose-constraints",
    retrieveManaged := true,
    logLevel in Compile := Level.Error,

    scalacOptions += "-deprecation",
    scalacOptions += "-feature",
    scalacOptions += "-language:implicitConversions",

    libraryDependencies += "org.eclipse.emf" % "org.eclipse.emf.ecore" % "2.12.+",
    libraryDependencies += "org.eclipse.emf" % "org.eclipse.emf.ecore.xmi" % "2.12.+",
    libraryDependencies += "org.eclipse.emf" % "org.eclipse.emf.common" % "2.12.+",
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test",

    unmanagedSourceDirectories in Compile += file(baseDirectory.value.getParent) / "robo-prose-model/src/",
    unmanagedSourceDirectories in Compile += file(mdsebookLocalBase.value.absolutePath) / "mdsebook.scala/src/main/scala",

  ).
  dependsOn(mdsebook)
