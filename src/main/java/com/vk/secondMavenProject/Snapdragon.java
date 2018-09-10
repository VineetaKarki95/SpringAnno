package com.vk.secondMavenProject;

import org.springframework.stereotype.Component;

@Component("snapji")// ("snapji")- if its not mentioned then by default bean name would be snapdragon(all lower case class's name)
public class Snapdragon implements MobileProcessor {

	public void process()
	{
		System.out.println("this processor's name is Snapdragon......");
	}

}
