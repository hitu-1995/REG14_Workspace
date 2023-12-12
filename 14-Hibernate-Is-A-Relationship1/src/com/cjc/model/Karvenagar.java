package com.cjc.model;

import javax.persistence.Entity;

@Entity
public class Karvenagar extends CJC {

	private String karvenagar_batchId;
	private String karvenagar_batchType;

	public String getKarvenagar_batchId() {
		return karvenagar_batchId;
	}

	public void setKarvenagar_batchId(String karvenagar_batchId) {
		this.karvenagar_batchId = karvenagar_batchId;
	}

	public String getKarvenagar_batchType() {
		return karvenagar_batchType;
	}

	public void setKarvenagar_batchType(String karvenagar_batchType) {
		this.karvenagar_batchType = karvenagar_batchType;
	}

}
