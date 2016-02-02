# play2.4-scalatest-demo
play 2.4 with scalatest demo



Build requirements:

* Oracle [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 8
* [Scala](http://scala-lang.org/files/archive/scala-2.11.7.tgz) 2.11.7
* [sbt](http://www.scala-sbt.org) 0.13.9


We are using the artima plugin for [scalatest](http://www.scalatest.org/install)

we must add the following line to ~/.sbt/0.13/global.sbt:

<!-- language: lang-none -->
    resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"


Then the project should build normally:

    $ sbt clean compile


# Test

    $ sbt test
