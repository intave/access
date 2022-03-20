# intave/access

This is a collection of interfaces for bukkit plugin developers interacting with the [Intave Anticheat](https://intave.de/). All classes present here will be available in the Intave jar file in production. Visit our [Discord Server](https://intave.de/go/discord) in case you experience any issues or are looking for further instructions on how to work with.

## Downloading the jar file

1. Go to https://github.com/intave/access/actions.
2. Click on the latest successful build.
3. Click on the `intave-access` artifact at the bottom to download the .jar.

## Using intave/access with Maven

Intave Access is published via Github Packages. Currently, Github requires authentication for installing such packages with Maven.

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
