package com.example.demo.classe;

import com.example.demo.controller.ClasseController;
import com.example.demo.controller.FiliereController;
import com.example.demo.repository.ClasseRepository;
import com.example.demo.repository.FiliereRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ClasseController.class)
public class ClasseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClasseRepository classeRepository;

    @Test
    public void TestFindAll() throws Exception{
        MvcResult result=mockMvc.perform(get("/classes")).andExpect(status().isOk()).andReturn();
        String jsonResponse=result.getResponse().getContentAsString();
        System.out.println(jsonResponse);
        System.out.println("Okey");

    }
}
