package org.asset.service;

import org.asset.breakdown.dao.InterfaceBreakdownDAO;
import org.asset.common.Response;
import org.asset.dto.AssetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class AssetServiceImpl implements InterfaceAssetService {
	
	@Autowired
	InterfaceBreakdownDAO breakDAO;
	
	@Override
	public Response saveAsset(AssetDTO assetdto) {
			Response res=new Response();
				System.out.println("*********In AssetService saveAsset()");
					res=breakDAO.saveAsset(assetdto);
				return res;
			}
}
