package demo.config;

import demo.services.HelloWorldFactory;
import demo.services.HelloWorldService;
import demo.services.HelloWorldServiceEnglishImpl;
import demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Bheesma on 4/20/2017.
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Profile({"English","default"})
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("English");
    }
    @Bean
    @Profile("Spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("Spanish");
    }
    @Bean
    @Profile("Tamil")
    public HelloWorldService helloWorldServiceTamil(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("Tamil");
    }
    @Bean
    @Profile("Hindi")
    public HelloWorldService helloWorldServiceHindi(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("Hindi");
    }
    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }
}
