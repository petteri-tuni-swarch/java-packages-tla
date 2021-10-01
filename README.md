# Java Core TLA - Maven Packages

How to divide the code to separate packages and 
* use them with maven dependencies
* build a runnable JAR file that contains dependencies

## Parent folder

Parent folder contains pom.xml to build bot sub projects with one command.

## Folder: extpkg

This contains no runnable code. Just one package with one class "GenericCar".

## Folder: dependent

This contains App.java with main and TiteCar class that extendes the "GenericCar".

pom.xml shows how to use the other package from other Maven project and how to build runnable stand alone JAR file.

# In practice:

Clone the project:
```
$ git clone git@github.com:petteri-tuni-swarch/java-packages-tla.git
$ cd java-packages-tla
```

Build. This builds both the extpkg and dependent projects.
```
$ mvn install
```

Run:
```
$ cd dependent
$ java -jar target/dependent-1.0-SNAPSHOT-jar-with-dependencies.jar
```


