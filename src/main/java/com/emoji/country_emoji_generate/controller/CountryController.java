package com.emoji.country_emoji_generate.controller;

import com.emoji.country_emoji_generate.model.Country;
import com.emoji.country_emoji_generate.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getAllCountries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }
}
