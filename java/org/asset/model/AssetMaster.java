package org.asset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AssetMaster {
	
	private int assetId;
	private String assetName;
	private String assetDesciption;
	
	public AssetMaster() {
		super();
		System.out.println("***********\t In Asset Master");
	}
	
	public AssetMaster(int assetId, String assetName, String assetDesciption) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetDesciption = assetDesciption;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetDesciption() {
		return assetDesciption;
	}
	public void setAssetDesciption(String assetDesciption) {
		this.assetDesciption = assetDesciption;
	}
	
}
