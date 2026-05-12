package org.springframework.web.servlet.mvc;

import java.util.Collections;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FreemarkerController implements Controller {

	@Override
	public @Nullable ModelAndView handleRequest(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		//
		return new ModelAndView("freemarker", Collections.singletonMap("message", "Freemarker"));
		//
	}

}