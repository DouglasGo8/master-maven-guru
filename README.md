# Apache Maven: Beginner to Guru

---

## Command Line Java

```sh
$javac {{FILE}}.java
$jar cf {{FILE}}.jar {{FILE}.class
$java -classpath *.jar {{ClassName}}
$javac -classpath ./lib/* {{FILE.java}} lib here have a 3rd lib
$java -classpath ./lib/*:./ {{ClassName}}
```

## Maven Command Line

```sh
$mvn clean -DskipTests dependency:resolve
$mvn clean -DskipTests verify
$mvn clean -DskipTests compile exec:java
$mvn clean -DskipTests package
```
