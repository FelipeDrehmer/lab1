package br.com.faculdadedonaduzzi.lab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LabApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAllTasks() throws Exception {
		mockMvc.perform(get("/tarefas"))
				.andExpect(status().isOk());
	}

}
