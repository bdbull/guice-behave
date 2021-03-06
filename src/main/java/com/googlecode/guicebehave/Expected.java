package com.googlecode.guicebehave;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Expected {

	Class<? extends Throwable> value();
	
	/**
	 * Defines the regular expression should
	 * match with the message of the exception.
	 */
	String message() default "";
	
}
