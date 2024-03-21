package com.example.bookstoremanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.example.bookstoremanagementapp"})
public class App 
{
public static void main( String[] args )
    {
        
        SpringApplication.run(App.class,args);
    }

    
}
