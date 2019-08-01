package com.contacts.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.entity.USERentity;
import com.contacts.mapper.USERmapper;

@RestController
public class USERcontrol {
	
	@Autowired
	private USERmapper usermapper;
	
	@RequestMapping(value="/selectAll",method=RequestMethod.GET)
	private Map<String, Object> selectAll(){	
			Map<String, Object> modelmap = new HashMap<String, Object>();
			List<USERentity> list = usermapper.selectAll();
			modelmap.put("userlist", list);
			return modelmap;
		
	}
	
	@RequestMapping(value="/selectById", method=RequestMethod.GET)
	private Map<String, Object> selectById(int id){
		Map<String, Object> modelmap = new HashMap<String, Object>();
		List<USERentity> list = usermapper.selectById(id);
		modelmap.put("user",list);
		return modelmap;
	}
	
	@RequestMapping(value="/selectByName", method=RequestMethod.GET)
	private Map<String, Object> selectByName(String name){
		Map<String, Object> modelmap = new HashMap<String, Object>();
		name="%"+name+"%";
		List<USERentity> list = usermapper.selectByName(name);
		modelmap.put("user",list);
		return modelmap;
	}
		
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	private Map<String, Object> insert(String name,String num) 
	{	
		
		int t=1;
		while(!usermapper.selectById(t).isEmpty()) {
			t++;
		}
		String auto_id= String.valueOf(t);
		Map<String, Object> modelmap = new HashMap<String, Object>();
		modelmap.put("success",usermapper.insert(auto_id,name,num));
		return modelmap;
		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	private Map<String, Object> delete(String id){
		Map<String, Object> modelmap = new HashMap<String, Object>();
		modelmap.put("success",usermapper.delete(id));
		return modelmap;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	private Map<String, Object> update(String id,String name,String num){
		Map<String, Object> modelmap = new HashMap<String, Object>();
		modelmap.put("success",usermapper.update(id, name, num));
		return modelmap;
	}
	
}
