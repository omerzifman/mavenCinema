package com.spring.Exceptions;

public class NotEnoughSpaceException extends RuntimeException
{
	public NotEnoughSpaceException(String message)
	{
		super(message);
	}
}
