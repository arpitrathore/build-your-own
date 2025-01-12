- [Setup](#setup)
  - [1. Install sdkman](#1-install-sdkman)
  - [2. Install JDK 21 along with GraalVM](#2-install-jdk-21-along-with-graalvm)
- [Build and test](#build-and-test)
  - [1. Build project to create native binary](#1-build-project-to-create-native-binary)
  - [2. Test](#2-test)

# Setup

## 1. Install sdkman
Install sdkman from here: [link](https://sdkman.io/)

## 2. Install JDK 21 along with GraalVM
```sh 
$ sdk install java 21.0.2-graalce
```

# Build and test

## 1. Build project to create native binary
```sh
mvn clean package -Pnative
```

Output
```txt
Produced artifacts:
 /path/to/build-your-own/01-hello-world/target/ar-helloworld (executable)
========================================================================================================================
Finished generating 'ar-helloworld' in 22.0s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  24.733 s
[INFO] Finished at: 2025-01-01T23:02:32+05:30
[INFO] ------------------------------------------------------------------------
```

## 2. Test
```sh
./target/ar-helloworld
```

Output:
```txt
Hello World! Current time is: 2025-01-01T23:02:39.372833
```