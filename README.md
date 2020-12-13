# ;Apache Maven :: Beginner to Guru
(Ref)[http://maven.apache.org/ref/3.6.3/]
---

## Command Line Java


$ javac {{FILE}}.java
$ jar cf {{FILE}}.jar {{FILE}.class
$ java -classpath *.jar {{ClassName}}
$ javac -classpath ./lib/* {{FILE.java}} lib here have a 3rd lib
$ java -classpath ./lib/*:./ {{ClassName}}

## Maven Command Line

$ mvn clean -DskipTests dependency:resolve
$ mvn clean -DskipTests verify
$ mvn clean -DskipTests compile exec:java
$ mvn clean -DskipTests package


## Maven version - 3.2.1-987-beta

* Major Version - first Number (3)
* Minor Version - second Number (3)
* An incremental version - (patch) - third number 1
* Builder number from CI Build - 987
* Qualifier - String Qualifier - 'beta'
* Most common in use is just major.minor.incremental(3,2, 1)

## Maven version - 3.2.1-SNAPSHOT

* Tells Maven this is a **development** version
* Represents not stable version and Maven should check for newer versions

## Maven Repositories

- Local:  Repo on Local system e.g /user/.m2/**
- Central: Public repo hosted by Maven Community - <https://repo1.maven.org/maven2>
- Remote: Other locations which can be public or private e.g JBoss, Oracle

## Maven Dependencies

* Cyclic dependencies aren't supported
* Can go many MANY layers Deep
* Excluded dependencies can be remove specifics dependencies
* Scopes
  * Compile is default represents dependencies available on all Classpath, also propagated to downstream projects
  * Provided like compile, but expected to be provided by JDK or container runtime
  * Runtime not required for compile, but need for runtime. On runtime and tests Classpaths, not compile
  * Test only available on test classpath, not transitive
  * System similar to provided, but jar is added to system explicitly
  * Import - imports dependency of POM
* Plugins operations
  
$ mvn dependency:tree
$ mvn dependency:go-offline
$ mvn dependency:purge-local-repository
$ mvn dependency:sources-get

* Maven standard dir
```text
+- src
  +- main
  | +- java
  |   +- resources
  +- test
  | +- java
  |   +- resources
```
## Maven build LifeCycles

* Maven is based over lifecycle and is pre-defined group of build steps called phases, each phase can be one or more plugins goals

$ mvn validate
$ mvn compile
$ mvn test
$ mvn package
$ mvn verify
$ mvn install
$ mvn deploy

# Maven Archetypes

* An original pattern or model from with all other things of the same kind are made