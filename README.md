# intave/access

This is a collection of interfaces for bukkit plugin developers interacting with the [Intave Anticheat](https://intave.de/). All classes present here will be available in the production Intave plugin. Visit our [Discord Guild](https://intave.de/go/discord) in case you run into any issues or seek any further help.

## Downloading the jar file

1. Go to https://github.com/intave/access/releases.
2. Click on the latest release.
3. Click on the intave-access-\<version\>.jar to download it.

## Using intave/access with Maven

Intave Access v14.4.2+ is published via maven repository. Replace `VERSION` with the latest API version.

Not every Intave update gets a new API version. [Available API versions](https://repo.janmm14.de/#browse/browse:intave:de%2Fjpx3%2Fintave%2Faccess%2Fintave-access)

<details>
    <summary><b style="color:blue">Maven</b></summary>

```xml
    <repositories>
        <repository>
            <id>janmm14-intave</id>
            <url>https://repo.janmm14.de/repository/intave/</url>
        </repository>
    </repositories>
```
```xml
   <dependencies>
       <dependency>
           <groupId>de.jpx3.intave.access</groupId>
           <artifactId>intave-access</artifactId>
           <version>VERSION</version>
       </dependency>
   </dependencies>
```
</details>

<details>
   <summary><b>Gradle Kotlin</b></summary>

```kts
    maven {
        url = uri("https://repo.janmm14.de/repository/intave/")
    }
```
```kts
   compileOnly("de.jpx3.intave.access:intave-access:VERSION")
```

</details>
<details>
   <summary><b>Gradle Groovy</b></summary>

```groovy
    maven {
        url "https://repo.janmm14.de/repository/intave/"
    }
```
```groovy
    compileOnly 'de.jpx3.intave.access:intave-access:VERSION'
```
</details>

<details>
<summary>up to v14.4.2</summary>
Intave Access is published via Github Packages. Currently, Github requires authentication for accessing such packages with Maven.

1. Create a personal access token in Github with `read:packages` permission (Settings -> Developer Settings -> Personal Access Token).
2. Create a `settings.xml` file in your `~/.m2` folder with the following contents:
   ```xml
   <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
     <activeProfiles>
       <activeProfile>github</activeProfile>
     </activeProfiles>

     <profiles>
       <profile>
         <id>github</id>
         <repositories>
           <repository>
             <id>central</id>
             <url>https://repo1.maven.org/maven2</url>
           </repository>
           <repository>
             <id>github</id>
             <url>https://maven.pkg.github.com/intave/access</url>
             <snapshots>
               <enabled>true</enabled>
             </snapshots>
           </repository>
         </repositories>
       </profile>
     </profiles>

     <servers>
       <server>
         <id>github</id>
         <username>USERNAME</username>
         <password>TOKEN</password>
       </server>
     </servers>
   </settings>
   ```
   Replace USERNAME with the username you use to log into github and TOKEN with the personal access token you just created.
3. Add access as a dependency in your pom.xml:
   ```xml
   <dependencies>
       <dependency>
           <groupId>de.jpx3.intave.access</groupId>
           <artifactId>intave-access</artifactId>
           <version>VERSION</version>
       </dependency>
   </dependencies>
   ```
   Replace VERSION with the latest API version. You can find the latest version here: https://github.com/intave/access/packages/1253852
   
For more information, please visit [Github's documentation on Github Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry).
</details>
