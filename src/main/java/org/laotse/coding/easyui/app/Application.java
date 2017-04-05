/*******************************************************************************
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 1, 2017 1:45:41 PM
 *******************************************************************************/

package org.laotse.coding.easyui.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application.
 *
 * @author ZhongWen Li (mailto:lizw@primeton.com)
 */
@EnableAutoConfiguration
@ComponentScan("org.laotse.coding.easyui")
public class Application {
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
