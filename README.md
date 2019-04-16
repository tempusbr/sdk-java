# sdk-samples

# Import SDK into application
To import SDK into application we use Tempus specific Maven repo. To have the repository, add these lines to your pom.xml file.
```
<repositories>
    <repository>
        <id>Tempus-maven-repo</id>
        <url>https://storage.googleapis.com/tempusmaven/release/tempus/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
</repositories> 
```

To download the library into project, add the below dependency into the project dependencies.

```
<dependencies>
...
    <dependency>
        <groupId>tempus</groupId>
        <artifactId>iot-sdk</artifactId>
        <version>1.0.0</version>
    </dependency>
...
</dependencies>
```
