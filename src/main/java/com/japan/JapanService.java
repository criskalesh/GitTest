package com.japan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.japan.dao.UserDao;
import com.japan.model.UsersGroup;

@Path("rest")
public class JapanService {
	
	@Autowired
	private UserDao userDao;
	
	@GET
	public String helloworld() {
		UsersGroup ug = new UsersGroup();
		ug.setName("Jinkan");
		ug.setDescription("Jumpan");
		try{
			userDao.saveUserGroup(ug);
		}catch(Exception e){
			e.printStackTrace();
		}		
		return "OK!";
	}
}
