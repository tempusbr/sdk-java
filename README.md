# SDK Samples for TempusBR IoT
This project contains sample applications to use TempusBR IoT middleware cloud. This applications use SDK maven file that is already provided with public access, however connecting to the cloud service is protected by API_KEY. Please replace the API_KEY with your key.

## Import SDK into application
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

## Project structure
SDK is simply made of a `Connector` class that is repsonsible to simplify connecting to the cloud service. By using `connect(KEY)` function, the service validate access and get related configurations. Afterwards we can create Record object and send it to the systemvia `send(Record)` method.
