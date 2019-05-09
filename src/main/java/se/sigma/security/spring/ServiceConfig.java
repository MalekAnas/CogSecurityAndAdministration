package se.sigma.security.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "se.sigma.security.service" })
public class ServiceConfig {
}
