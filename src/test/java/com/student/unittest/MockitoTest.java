package com.student.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.student.controller.Entrance;
import com.student.dao.NewDao;
import com.student.service.NewServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import javax.annotation.Resource;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Entrance.class, NewServiceImpl.class })
@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)
public class MockitoTest {

//	@Resource
	@InjectMocks
//	@Autowired
	
	private Entrance entrance;

	@Spy
//	@Resource
	@InjectMocks
	private NewServiceImpl service;

	@Spy
//	@Resource
//	@Autowired
//	@MockBean
//	@Mock
//	private NewDao newDao = new NewDao();
	private NewDao newDao;
	
	@Before
	public void setup() {
		entrance = new Entrance();
		MockitoAnnotations.initMocks(this);

		
//		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(entrance).build();
	}

	@Test
	public void injectClass() {

		when(newDao.getStr()).thenReturn("spy inject");

//		assertEquals(service.test(), "spy inject");
//		System.out.println(entrance.test());
		String xx = entrance.test();
		assertEquals(xx, "spy inject");

	}

}
