package telran.java2022.post.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import telran.java2022.post.controller.PostController;

// to prove that the context is creating your controller

@SpringBootTest
class SmokeTest {

	@Autowired
	private PostController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
