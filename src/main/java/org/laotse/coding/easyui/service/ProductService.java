/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 10:22:21 PM
 *******************************************************************************/

package org.laotse.coding.easyui.service;

import java.util.List;

import org.laotse.coding.easyui.model.Product;

/**
 * ProductService. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
public interface ProductService {

	Product create(Product product);
	
	Product update(Product product);
	
	Product remove(String id);
	
	Product get(String id);
	
	List<Product> query(String name, String version, String type, String pm, String owner);
	
}
