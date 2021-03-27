package com.example.demo.filiere;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.demo.controller.FiliereController;
import com.example.demo.repository.FiliereRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(controllers = FiliereController.class)
public class FilireControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FiliereRepository filiereRepository;

    @Test
    public void TestFindAll() throws Exception{
        MvcResult result=mockMvc.perform(get("/filieres")).andExpect(status().isOk()).andReturn();
        String jsonResponse=result.getResponse().getContentAsString();
        System.out.println(jsonResponse);

    }
}
