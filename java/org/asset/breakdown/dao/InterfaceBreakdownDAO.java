package org.asset.breakdown.dao;

import org.asset.common.Response;
import org.asset.dto.AssetDTO;



public interface InterfaceBreakdownDAO {
	
	public Response saveAsset(AssetDTO assetdto);

}
