package com.vk.secondMavenProject;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


//Advice(What??) -> Before,After.....
//Pointcut(Where????) -> example: "execute(public void show())"

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyHelperClass {
    
	@Before("execution(public void show())")
	public void methodNeedToBeInAllClass()
	{
		System.out.println("This method has to be there in every class but dont need to be called!!!");
	}
}
