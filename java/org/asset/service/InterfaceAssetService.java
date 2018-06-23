package org.asset.service;

import org.asset.common.Response;
import org.asset.dto.AssetDTO;

public interface InterfaceAssetService {
	
	public Response saveAsset(AssetDTO assetdto);
}
