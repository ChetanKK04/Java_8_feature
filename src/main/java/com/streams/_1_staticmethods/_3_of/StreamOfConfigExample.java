package com.streams._1_staticmethods._3_of;

import java.util.stream.Stream;

public class StreamOfConfigExample {
    public static void main(String[] args) {
        Config[] configs = {
                new Config("url", "http://example.com"),
                new Config("timeout", "5000"),
                new Config("maxConnections", "100")
        };

        // Create a stream from an array of configurations
        Stream<Config> configStream = Stream.of(configs);

        // Print the configuration settings
        configStream.forEach(System.out::println);
    }
}

class Config {
    String key;
    String value;

    Config(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}