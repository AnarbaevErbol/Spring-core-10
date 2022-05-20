package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:app.properties")
public class MyConfig {

    @Bean
    public Horse horse(){
        return new Horse();
    }

    @Bean
    public Penguin penguin(){
        return new Penguin();
    }

    @Bean
    public Person person(){
        return new Person("Nuriza",25,horse());
    }

    @Bean
    public Person person2(){
        return new Person("Erbol",26,penguin());
    }
}
