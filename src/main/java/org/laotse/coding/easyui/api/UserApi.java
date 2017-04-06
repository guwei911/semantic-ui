/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 11:18:20 PM
 *******************************************************************************/

package org.laotse.coding.easyui.api;

import java.util.List;

import org.laotse.coding.easyui.model.User;
import org.laotse.coding.easyui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserApi. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
@RestController
@RequestMapping(value = ApiVersion.NOW + "/users", 
	produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
	consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserApi {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> query() {
		return service.query();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(User user) {
		return service.create(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User update(User user) {
		return service.update(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public User get(@PathVariable("id") String id) {
		return service.get(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public User remove(@PathVariable("id") String id) {
		return service.remove(id);
	}

}
