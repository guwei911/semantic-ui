/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 10:34:54 PM
 *******************************************************************************/

package org.laotse.coding.easyui.service;

import java.util.List;

import org.laotse.coding.easyui.model.User;

/**
 * UserService. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
public interface UserService {
	
	User create(User user);
	
	User update(User user);
	
	/**
	 * ID OR EMAIL
	 * 
	 * @param id
	 * @return
	 */
	User get(String id);
	
	/**
	 * ID OR EMAIL
	 * 
	 * @param id
	 * @return
	 */
	User remove(String id);
	
	List<User> query();
	
}
