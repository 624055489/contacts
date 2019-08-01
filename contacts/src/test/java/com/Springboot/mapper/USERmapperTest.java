package com.Springboot.mapper;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.contacts.mapper.USERmapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class USERmapperTest {
	@Autowired
	private USERmapper usermapper;

	@Test
	@Ignore
	public void testSelectAll() throws Exception {
		Assert.assertEquals(8, usermapper.selectAll().size());
	}

	@Test
	@Ignore
	public void testSelectById() {
		Assert.assertEquals(1, usermapper.selectById(1).size());
	}

	@Test
	@Ignore
	public void testInsert() {
		Assert.assertEquals(true, usermapper.insert("999", "test", "testnum"));
	}

	@Test
	
	public void testDelete() {
		Assert.assertEquals(true, usermapper.delete("999"));
	}

	@Test
	@Ignore
	public void testUpdate() {
		Assert.assertEquals(true, usermapper.update("999", "aaa", "111"));
	}

}
