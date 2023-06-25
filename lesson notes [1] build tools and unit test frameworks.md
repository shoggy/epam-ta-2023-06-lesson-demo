# Maven

before:

```cmd
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_<update>
set PATH=%PATH%;%JAVA_HOME%\bin
cd <project dir>
md target\classes
where /r . *.java > sources.list
javac -d target\classes -encoding UTF-8 -source 1.8 -sourcepath src/main/java @sources.list
jar -cfen0 target\attraining.jar ru.training.at.hw1.App -C target\classes .
java -jar target\attraining.jar 100
```

after:

```cmd
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_<update>
set MAVEN_HOME=<maven_location>
set PATH=%PATH%;%JAVA_HOME%\bin;%MAVEN_HOME%\bin
cd <project dir>
mvn package
```

create maven project from console (^ symbol is used for multiline input)

```cmd 
mvn archetype:generate ^
    -DinteractiveMode=false ^
    -DarchetypeGroupId=org.apache.maven.archetypes ^
    -DarchetypeArtifactId=maven-archetype-quickstart ^
    -DarchetypeVersion=1.4 ^
    -DgroupId=com.epam.tc.demo ^
    -DartifactId=epam-test-auto-jul-2021 ^
    -Dversion=2021.07.29-SNAPSHOT
```

# References

JUnit 4

- https://github.com/junit-team/junit4/wiki/Getting-started -- official "Getting started", on the side there is "Pages" section that contain a lot of useful information

TestNG

- https://testng.org/doc/documentation-main.html

JUnit 5

- https://junit.org/junit5/docs/current/user-guide/

Hamcrest / AssertJ

- https://mkyong.com/tag/hamcrest/
- https://www.baeldung.com/?s=hamcrest
- https://www.baeldung.com/introduction-to-assertj
- https://www.blazemeter.com/blog/hamcrest-vs-assertj-assertion-frameworks-which-one-should-you-choose

About tests in general (in Russian)

- https://habr.com/ru/company/yandex/blog/346186/ -- you can skip last part regarding Espresso, и for now you can skip part before last one regarding mocs

Maven

- https://maven.apache.org/
- https://maven.apache.org/what-is-maven.html 
- https://maven.apache.org/guides/getting-started/index.html 
- http://maven.apache.org/ref/3.6.3/maven-core/lifecycles.html 
- https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html 
- http://maven.apache.org/plugins/index.html 

Not documentation, but for me it was much easier to understand (in Russian)
Не совсем документация, но мне в свое время оказалось более понятно

- https://habr.com/ru/post/77382/ -- maven overview
- https://habr.com/ru/sandbox/27207/ -- good description of profiles
- https://web.archive.org/web/20200222031457/www.apache-maven.ru/index.html -- plugins and their configuration

Idea and Git

- https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html#ecb8c00d
- https://www.jetbrains.com/help/idea/set-up-a-git-repository.html#add-remote (+ links on the left navigation bar)

:heavy_plus_sign: links from the presentation
