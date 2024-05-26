package com.mms.brewery.client.web.client;

import com.mms.brewery.client.web.model.v2.BeerDtoV2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {


    @Autowired
    BreweryClient client;


    @Test
    void getBeerById() {
        BeerDtoV2 dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }
}