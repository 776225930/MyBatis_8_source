package com.example.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
public class MyBatisTest {
	public SqlSessionFactory getSessionFactory() throws IOException{
		String resource="mybatis-config.xml";
		InputStream in=Resources.getResourceAsStream(resource);
	    return new SqlSessionFactoryBuilder().build(in);
	   
	}
	@Test
	public void test() throws IOException {
	}

}
