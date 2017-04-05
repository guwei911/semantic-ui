/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 11:29:57 PM
 *******************************************************************************/

package org.laotse.coding.easyui.api;

import java.util.List;

import org.laotse.coding.easyui.model.Product;
import org.laotse.coding.easyui.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductApi. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
@RestController
@RequestMapping(ApiVersion.NOW + "/products")
public class ProductApi {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public List<Product> query(String name, String version, String type, String pm, String owner) {
		return service.query(name, version, type, pm, owner);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public Product create(Product product) {
		return service.create(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public Product update(Product product) {
		return service.update(product);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Product get(@PathVariable("id") String id) {
		return service.get(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public Product remove(@PathVariable("id") String id) {
		return service.remove(id);
	}

}
