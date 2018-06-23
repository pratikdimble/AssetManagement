package org.asset.dto;

public class AssetDTO {
	private int assetId;
	private String assetName;
	private String assetDesciption;
	
	public AssetDTO() {
		super();
		System.out.println("************ From AssetDTO");
	}
	
	public AssetDTO(int assetId, String assetName, String assetDesciption) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetDesciption = assetDesciption;
	}
	
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
