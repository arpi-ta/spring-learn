package com.cognizant.springlearn.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private String code;
    private String name;
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Country.class);

    public Country(){}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
        LOGGER.debug("INSIDE The Constructor");
    }

    public String getCode() {
        LOGGER.info("GET CODE");
        return code;
    }

    public String getName() {
        LOGGER.info("GET NAME");
        return name;
    }
    public void setCode(String code) {
        LOGGER.info("SET CODE");
        this.code = code;
    }

    public void setName(String name) {
        LOGGER.info("SET NAME");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
