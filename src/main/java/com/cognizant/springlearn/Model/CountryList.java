package com.cognizant.springlearn.Model;

import java.util.List;

public class CountryList {


     private List<Country> countryList;

     public  CountryList(){}


    public CountryList(List<Country> countryList) {
        this.countryList = countryList;
    }



    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

}
