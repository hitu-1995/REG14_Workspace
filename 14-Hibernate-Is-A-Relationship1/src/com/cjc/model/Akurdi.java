package com.cjc.model;

import javax.persistence.Entity;

@Entity
public class Akurdi extends CJC {

	private String akurdi_batchId;
	private String akurdi_batchType;

	public String getAkurdi_batchId() {
		return akurdi_batchId;
	}

	public void setAkurdi_batchId(String akurdi_batchId) {
		this.akurdi_batchId = akurdi_batchId;
	}

	public String getAkurdi_batchType() {
		return akurdi_batchType;
	}

	public void setAkurdi_batchType(String akurdi_batchType) {
		this.akurdi_batchType = akurdi_batchType;
	}

}
