package com.example.demo.etudiant;

import com.example.demo.controller.CoursController;
import com.example.demo.controller.EtudiantController;
import com.example.demo.repository.CoursRepository;
import com.example.demo.repository.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EtudiantController.class)
public class EtudiantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EtudiantRepository etudiantRepository;

    @Test
    public void TestFindAll() throws Exception{
        MvcResult result=mockMvc.perform(get("/etudiants")).andExpect(status().isOk()).andReturn();
        String jsonResponse=result.getResponse().getContentAsString();
        System.out.println(jsonResponse);
        System.out.println("Okey");

    }
}
