package com.cjavaperu.programatica.anotacion.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cjavaperu.programatica", "com.cjavaperu.dao"})
public class AppConfig {

}
