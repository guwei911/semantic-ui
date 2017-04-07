/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 7, 2017 2:06:36 PM
 *******************************************************************************/

package org.laotse.coding.easyui.api;

import java.util.Map;
import java.util.Properties;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SystemApi.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
@RestController
@RequestMapping(value = ApiVersion.NOW + "/systems", 
	produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
	consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SystemApi {
	
	@RequestMapping(method = RequestMethod.GET, value = "/jvm")
	public Properties getJvmEnvironment() {
		return System.getProperties();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/os")
	public Map<String, String> getOsEnvironment() {
		return System.getenv();
	}

}
