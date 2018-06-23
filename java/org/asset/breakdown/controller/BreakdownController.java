package org.asset.breakdown.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.asset.common.Response;
import org.asset.dto.AssetDTO;
import org.asset.service.InterfaceAssetService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BreakdownController {
	
	@Autowired
	InterfaceAssetService assetService;
	
	@RequestMapping(value="/")
	public String landing(HttpServletRequest req,HttpServletResponse res){
		return "/firstpage";
	}//landing() close
	
	
	@RequestMapping(value="/add" ,method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response<String> saveStudent(@RequestBody String asset){
		System.out.println("*********In StudentController saveStudent()");
		System.out.println(asset);
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		AssetDTO dtoObj=new AssetDTO();
		try {
			dtoObj = mapper.readValue(asset,AssetDTO.class);
			
			System.out.println(dtoObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Response response=assetService.saveAsset(dtoObj);
		JSONObject json=new JSONObject(response);
		System.out.println("From Controller------>"+json);
		return response;
	}//saveStudent() close

}
