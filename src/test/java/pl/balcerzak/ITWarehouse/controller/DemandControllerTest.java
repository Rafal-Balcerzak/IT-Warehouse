package pl.balcerzak.ITWarehouse.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pl.balcerzak.ITWarehouse.entity.Demand;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemandControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void souldgetSingleDemand() throws Exception {
        /*mockMvc.perform(MockMvcRequestBuilders.get("/api/demand/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.idDemand", Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.model", Matchers.is("EliteBook 840 G5")));*/

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/demand/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andReturn();

        Demand demand = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), Demand.class);
        Assertions.assertNotNull(demand);
        Assertions.assertEquals(demand.getModel(), "EliteBook 840 G5");

    }

}
