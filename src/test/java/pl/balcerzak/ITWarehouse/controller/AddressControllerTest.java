package pl.balcerzak.ITWarehouse.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.transaction.annotation.Transactional;
import pl.balcerzak.ITWarehouse.entity.Address;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AddressControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldGetAddressById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/address/1"))
                .andDo(print())
                .andExpect(status().is(200))
                .andReturn();

        Address address = objectMapper.readValue(mvcResult.getResponse()
                .getContentAsString(), Address.class);
        Assertions.assertNotNull(address);
        Assertions.assertEquals(address.getIdAddress(), 1);
        Assertions.assertEquals(address.getCountry(), "Polska");
        Assertions.assertEquals(address.getRegion(), "Mazowieckie");
        Assertions.assertEquals(address.getCity(), "Zdunowo");
        Assertions.assertEquals(address.getStreet(), "Szlak Truskawkowy");
        Assertions.assertEquals(address.getLocalNumber(), "48");
        Assertions.assertEquals(address.getZipCode(), "09-142");
    }

    @Test
    void shouldAddAddress() throws Exception {

        Address newAddress = new Address();

        newAddress.setCountry("Polska");
        newAddress.setRegion("Pomorskie");
        newAddress.setCity("Gdansk");
        newAddress.setStreet("Dluga");
        newAddress.setLocalNumber("15");
        newAddress.setZipCode("80-003");

        String json = objectMapper.writeValueAsString(newAddress);

        mockMvc.perform(post("/api/address")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is(200));
    }


}
