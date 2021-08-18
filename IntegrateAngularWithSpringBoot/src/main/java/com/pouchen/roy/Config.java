package com.pouchen.roy;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScans(value = {
		@ComponentScan("Model"),
		@ComponentScan("controller"),
		@ComponentScan("DAO"),
		@ComponentScan("service")
})
public class Config {
	
}
