package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@Log4j2
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

  public static void main(String[] args) {

    SpringApplication.run(ConfigServer.class, args);
  }
}
