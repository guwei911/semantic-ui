/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 10:38:59 PM
 *******************************************************************************/

package org.laotse.coding.easyui.util;

import java.util.UUID;

/**
 * UuidUtils. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
public class UuidUtils {
	
	private UuidUtils() {}
	
	public static String generateNewId() {
		return generateNewId(false, true);
	}
	
	public static String generateNewId(boolean containSeprate, boolean toUpperCase) {
		String id = UUID.randomUUID().toString();
		id = toUpperCase ? id.toLowerCase() : id;
		return containSeprate ? id : id.replaceAll("-", "");
	}

}
