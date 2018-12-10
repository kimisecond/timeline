package com.softwareTest.timeline.Bean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RegisterBean implements Serializable
{
	@NotNull(message="Username can not be blank.")
	private String username;

	private String displayName;

	@NotNull(message="Password can not be blank.")
	private String password;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username=username;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName(String displayName)
	{
		this.displayName=displayName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password=password;
	}
}
