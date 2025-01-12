- [Build and test](#build-and-test)
  - [1. Build project to create native binary](#1-build-project-to-create-native-binary)
  - [2. Test and compare with wc](#2-test-and-compare-with-wc)

# Build and test

## 1. Build project to create native binary
```sh
$ mvn clean package -Pnative

# Output
Produced artifacts:
 /home/arpit/build-your-own/01-hello-world/target/ar-wc (executable)
========================================================================================================================
Finished generating 'ar-wc' in 22.5s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  25.061 s
[INFO] Finished at: 2025-01-08T08:21:08+05:30
[INFO] ------------------------------------------------------------------------
```

## 2. Test and compare with wc
```sh
$ ./target/ar-wc graalvm_wiki.txt
      7     102     680 graalvm_wiki.txt
      
$ wc graalvm_wiki.txt
       7     102     680 graalvm_wiki.txt
```