/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 1, 2017 2:09:03 PM
 *******************************************************************************/

package org.laotse.coding.easyui.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeApi.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
@Controller
public class HomeApi {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/index.html"); //$NON-NLS-1$
	}

}
