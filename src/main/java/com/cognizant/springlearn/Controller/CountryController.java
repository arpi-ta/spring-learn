package com.cognizant.springlearn.Controller;

import com.cognizant.springlearn.Model.Country;
import com.cognizant.springlearn.Service.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryServices countryServices;

    @RequestMapping("/countries")
    public List<Country> Countries(){
        List<Country> countrylist;
        countrylist=countryServices.displayCountries();
        return countrylist;
    }

    @RequestMapping("/countries/{id}")
    public Country  getCountry(@PathVariable String id){
        return countryServices.getCountry(id);
    }

}
