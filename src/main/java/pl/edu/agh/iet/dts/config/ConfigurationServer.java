package pl.edu.agh.iet.dts.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Bartłomiej Grochal
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServer.class, args);
    }

}
