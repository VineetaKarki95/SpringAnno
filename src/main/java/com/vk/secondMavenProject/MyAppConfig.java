package com.vk.secondMavenProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig 
{
	@Bean
    public Samsung getPhone()
    {
    	return new Samsung();
    }
	@Bean
	public MobileProcessor getCpu()
	{
		return new Snapdragon();
	}
}
