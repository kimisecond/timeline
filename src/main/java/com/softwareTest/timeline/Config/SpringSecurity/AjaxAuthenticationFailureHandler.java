package com.softwareTest.timeline.Config.SpringSecurity;

import com.softwareTest.timeline.Config.Constants;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler
{
	@Override
	public void onAuthenticationFailure(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,
										AuthenticationException e) throws IOException, ServletException
	{
		String jsonString=AjaxHandlerCommons.generateJSONResponse(Constants.LoginFailureStatus,Constants.LoginFailureMessage);
		httpServletResponse.getWriter().write(jsonString);
	}
}
