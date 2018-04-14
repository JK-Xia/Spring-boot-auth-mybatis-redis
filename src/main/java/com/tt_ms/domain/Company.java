package com.tt_ms.domain;

import java.io.Serializable;

/**
 *poker0325@me.com
 */

public class Company implements Serializable{

	private String state;
	private String zipCode;
	private String address;
	private String telphone;
	private String fax;
	private String storeBrand;
	private String invoiceTaxRate;
	private String areaCode;
	private String invoiceType;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStoreBrand() {
		return storeBrand;
	}

	public void setStoreBrand(String storeBrand) {
		this.storeBrand = storeBrand;
	}

	public String getInvoiceTaxRate() {
		return invoiceTaxRate;
	}

	public void setInvoiceTaxRate(String invoiceTaxRate) {
		this.invoiceTaxRate = invoiceTaxRate;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	@Override
	public String toString() {
		return "Company{" +
				"state='" + state + '\'' +
				", zipCode='" + zipCode + '\'' +
				", address='" + address + '\'' +
				", telphone='" + telphone + '\'' +
				", fax='" + fax + '\'' +
				", storeBrand='" + storeBrand + '\'' +
				", invoiceTaxRate='" + invoiceTaxRate + '\'' +
				", areaCode='" + areaCode + '\'' +
				", invoiceType='" + invoiceType + '\'' +
				'}';
	}
}
