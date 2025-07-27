package com.cognizant.spring_rest3.controller;

import com.cognizant.spring_rest3.Country;
import com.cognizant.spring_rest3.service.CountryService;
import com.cognizant.spring_rest3.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // GET /country (returns "India" from XML)
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - /country");

        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        LOGGER.debug("Country: {}", country);
        LOGGER.info("END - /country");

        return country;
    }

    // GET /countries/{code} (returns country by code or throws exception)
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START - /countries/{}", code);

        Country country = countryService.getCountry(code);

        LOGGER.debug("Country found: {}", country);
        LOGGER.info("END - /countries/{}", code);

        return country;
    }
}
