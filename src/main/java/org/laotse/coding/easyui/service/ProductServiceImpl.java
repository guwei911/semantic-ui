/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 11:10:41 PM
 *******************************************************************************/

package org.laotse.coding.easyui.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.StringUtils;
import org.laotse.coding.easyui.model.Product;
import org.laotse.coding.easyui.util.UuidUtils;
import org.springframework.stereotype.Service;

/**
 * ProductServiceImpl. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	private Map<String, Product> products = new ConcurrentHashMap<>();
	
	{
		for (int i = 0; i < 10; i++) {
			Product product = new Product();
			product.setName(UuidUtils.generateNewId());
			product.setOfflineDate(System.currentTimeMillis() + 9000000000L * (i + 1));
			product.setOnlineDate(System.currentTimeMillis() - 5000000000L * (i + 1));
			product.setReleaseDate(System.currentTimeMillis() - 9000000000L * (i + 1));
			product.setOwner(i % 2 == 0 ? "admin" : "anyous");
			product.setPm(i % 2 == 0 ? "tiger" : "fish");
			product.setType(i % 2 == 0 ? "MobilePay" : "OnlinePay");
			product.setVersion(i % 2 == 0 ? "1.0" : "2.0");
			product.setVision(i % 2 == 0 ? "我欲成仙 快乐齐天" : "跳出三界之外 不在五行之中");
			create(product);
		}
	}

	/* (non-Javadoc)
	 * @see org.laotse.coding.easyui.service.ProductService#create(org.laotse.coding.easyui.model.Product)
	 */
	@Override
	public Product create(Product product) {
		if (null == product) {
			return null;
		}
		product.setId(UuidUtils.generateNewId());
		products.put(product.getId(), product);
		return product;
	}

	/* (non-Javadoc)
	 * @see org.laotse.coding.easyui.service.ProductService#update(org.laotse.coding.easyui.model.Product)
	 */
	@Override
	public Product update(Product product) {
		if (null == product || StringUtils.isBlank(product.getId())) {
			return null;
		}
		if (products.containsKey(product.getId())) {
			products.put(product.getId(), product);
			return product;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.laotse.coding.easyui.service.ProductService#remove(java.lang.String)
	 */
	@Override
	public Product remove(String id) {
		if (StringUtils.isBlank(id)) {
			return null;
		}
		if (products.containsKey(id)) {
			return products.remove(id);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.laotse.coding.easyui.service.ProductService#get(java.lang.String)
	 */
	@Override
	public Product get(String id) {
		if (StringUtils.isBlank(id)) {
			return null;
		}
		return products.get(id);
	}

	/* (non-Javadoc)
	 * @see org.laotse.coding.easyui.service.ProductService#query(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Product> query(String name, String version, String type, String pm, String owner) {
		return Arrays.asList(products.values().toArray(new Product[products.size()]));
	}

}
