package org.springframework.web.servlet.mvc;

import java.io.OutputStream;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletController implements Controller {

	@Override
	public @Nullable ModelAndView handleRequest(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		//
		try (final OutputStream os = response != null ? response.getOutputStream() : null) {
			//
			if (os != null) {
				//
				os.write("servlet".getBytes());
			} // if
				//
		} // try
			//
		return null;
	}

}