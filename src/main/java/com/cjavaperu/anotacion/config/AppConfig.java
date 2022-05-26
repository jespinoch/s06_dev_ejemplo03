package com.cjavaperu.anotacion.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.cjavaperu.anotacion", "com.cjavaperu.dao"})
@EnableAspectJAutoProxy
public class AppConfig {

}
