package com.cliffordbechtel.spring6resttemplate.client;

import com.cliffordbechtel.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers(String beerName);
}
