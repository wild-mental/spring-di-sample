package com.example.springdisample.main;

import com.example.springdisample.SpringDiSampleApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringDiSampleApplication.class)
public class ApplicationConfig {
}
