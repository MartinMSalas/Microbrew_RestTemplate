package com.mms.brewery.client.web.client;

import com.mms.brewery.client.web.model.v2.BeerDtoV2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
import java.util.UUID;

@Component
@ConfigurationProperties(value = "mms.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    public final String BEER_PATH_V1 = "/api/v1/beer";
    public final String BEER_PATH_V2 = "/api/v2/beer";

    public final String BEER_PATH = BEER_PATH_V2;
    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
    private String apiHost;

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public BeerDtoV2 getBeerById(UUID uuid){
        return restTemplate.getForObject(apiHost + BEER_PATH + "/" + uuid.toString(), BeerDtoV2.class);
    }

    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2){
        return restTemplate.
    }
}
