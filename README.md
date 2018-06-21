# Lombok Project

Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again.

## Introduction

Lombok is used to reduce boilerplate code for model/data objects, e.g., it can generate getters and setters for those object automatically by using Lombok annotations. The easiest way is to use the @Data annotation.

By simply adding the @Data annotation you get all this for free:
* getters and setters
* @equals(Object) : boolean
* @canEquals(Object) : boolean
* @toString() : String
* @hashCode() : int

### Some More Annotations

* @Data annotation includes the functionality of @ToString, @EqualsAndHashCode, @Getter and @Setter. 
* @NoArgsConstructor
* @AllArgsConstructor

## Installation

You can download the latest lombok version from https://projectlombok.org/download.html or by using Gradle, Maven or other tools.

The lombok.jar can be copied into the root Eclipse or Spring Tool Suite folder and run like this:
```
java -jar lombok-1.16.12.jar
```
This will open a small UI, where the location of the Eclipse installation can be specified. Usually the Eclipse installation will be found automatically and lombok can be installed or updated.

Refer [Project Site](http://jnb.ociweb.com/jnb/jnbJan2010.html) for more details.
