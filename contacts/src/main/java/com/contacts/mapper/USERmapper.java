package com.contacts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.contacts.entity.USERentity;

@Component
@Mapper
public interface USERmapper {
	
	@Select("SELECT * FROM TELEPHONE order by NAME")
	List<USERentity> selectAll();
	
	@Select("SELECT * FROM TELEPHONE WHERE ID=#{id}")
	List<USERentity> selectById(int id);
	
	@Select("SELECT * FROM TELEPHONE WHERE NAME like #{name} order by NAME")
	List<USERentity> selectByName(String name);
	
	@Insert("INSERT INTO TELEPHONE(ID,NAME,NUM) VALUES(#{id},#{name},#{num})")
	boolean insert(String id,String name,String num);
	
	@Delete("DELETE FROM TELEPHONE WHERE ID=#{id}")
	boolean delete(String id);
	
	@Update("UPDATE TELEPHONE SET NAME=#{name},NUM=#{num} WHERE ID=#{id}")
	boolean update(String id , String name ,String num);
	
	
	
	
	
}
