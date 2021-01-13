# utopialib-java
Utopia Ecosystem API wrapper written in Java

example class

```java
public class Main {

    public static void main(String[] args) throws IOException {
        // sample using

        libUtp lol = new libUtp();

        lol.port = "20000";
        lol.token =  "219C91A00340B54F7AD4C1DB40E9B9E3";

        System.out.println(lol.getSystemInfo());
        //System.out.println(lol.getReleaseNotes());
    }
}
```

response:

```
{"result": {"buildAbi": "x86_64-little_endian-llp64","buildCpuArchitecture": "x86_64","build_number": "1.0.7114","currentCpuArchitecture": "x86_64","netCoreRate": 25,"networkCores": 4,"networkEnabled": true,"numberOfConnections": 15,"packetCacheSize": 977753,"uptime": "01:37:58"},"resultExtraInfo": {"elapsed": "0"}}
```
