/*******************************************************************************
 *
 * Copyright (c) 2001-2017 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on Apr 5, 2017 10:22:41 PM
 *******************************************************************************/

package org.laotse.coding.easyui.model;

/**
 * Product. <br>
 *
 * @author ZhongWen Li (mailto: lizw@primeton.com)
 */
public class Product {

	private String id;
	private String name;
	private String version;
	private String type;
	private String pm;
	private String owner;
	private String vision;
	private long releaseDate;
	private long onlineDate;
	private long offlineDate;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public long getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(long onlineDate) {
		this.onlineDate = onlineDate;
	}

	public long getOfflineDate() {
		return offlineDate;
	}

	public void setOfflineDate(long offlineDate) {
		this.offlineDate = offlineDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", version=" + version + ", type=" + type + ", pm=" + pm
				+ ", owner=" + owner + ", vision=" + vision + ", releaseDate=" + releaseDate + ", onlineDate="
				+ onlineDate + ", offlineDate=" + offlineDate + ", description=" + description + "]";
	}
	
}
