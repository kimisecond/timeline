package com.softwareTest.timeline.Bean;

import java.io.Serializable;


public class ResponseBody implements Serializable
{

	private String status;
	private String msg;
	private Object result;
	private String jwtToken;

	public ResponseBody()
	{
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status=status;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg=msg;
	}

	public Object getResult()
	{
		return result;
	}

	public void setResult(Object result)
	{
		this.result=result;
	}

	public String getJwtToken()
	{
		return jwtToken;
	}

	public void setJwtToken(String jwtToken)
	{
		this.jwtToken=jwtToken;
	}
}

