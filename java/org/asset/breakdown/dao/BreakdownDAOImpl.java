package org.asset.breakdown.dao;

import org.asset.common.Response;
import org.asset.dto.AssetDTO;
import org.asset.model.AssetMaster;
import org.dozer.DozerBeanMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("InterfaceBreakdownDAO")
public class BreakdownDAOImpl implements InterfaceBreakdownDAO {
	
	//get the session
		@Autowired
		private SessionFactory session;
		@Autowired
		private DozerBeanMapper mapper;
		
		protected Session getSession(){
			
			return session.getCurrentSession();
		}
	@Override
	public Response saveAsset(AssetDTO assetdto) {
		Response<String> response=new Response<String>();
		AssetMaster asset= mapper.map(assetdto, AssetMaster.class,"assetDTO_to_assetMaster");
			/*System.out.println("*********In StudentDAOImpl saveStudent()\n\n\t" +student.getStudentFname()
				+""+student.getStudentLname()+""+student.getUsername());*/
			int id=(Integer)getSession().save(asset);
				System.out.println("*********Asset Saved With ID:"+id);
					response.setStatus("success");
		return response;
	}

}
