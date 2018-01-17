package com.student.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.student.controller.HelloController;
import com.student.dao.NewDao;
import com.student.service.NewServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HelloController.class, NewServiceImpl.class })
@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)
public class MockitoTest {

	@InjectMocks
	private HelloController entrance;

	@Spy
	@InjectMocks
	private NewServiceImpl service;

	@Spy
	private NewDao newDao;

	@Before
	public void setup() {
		entrance = new HelloController();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void injectClass() {

		when(newDao.getStr()).thenReturn("spy inject");

		String xx = entrance.test();
		assertEquals(xx, "spy inject");

	}

}
