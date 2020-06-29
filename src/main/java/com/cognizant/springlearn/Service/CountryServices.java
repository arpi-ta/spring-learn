package com.cognizant.springlearn.Service;

import com.cognizant.springlearn.Model.Country;
import com.cognizant.springlearn.Model.CountryList;
import com.cognizant.springlearn.SpringLearnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CountryServices {



    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public  void displayDate()  {
        LOGGER.info("START");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format = ctx.getBean("dateFormat", SimpleDateFormat.class);

        Date date=null;

        try {
            date=format.parse("31/12/2018");
            LOGGER.debug(date.toString());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        LOGGER.info("END");
        //System.out.println(date);

    }

    public List<Country>  displayCountries(){
        LOGGER.info("LIst of Countries");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
        CountryList countryList= context.getBean("countryList",CountryList.class);
        List<Country> list= countryList.getCountryList();
        System.out.println(list);
        return list;
    }

    public Country getCountry(String id){
         List<Country> list= displayCountries();
         return list.stream().filter(t->t.getCode().equals(id)).findFirst().get();
    }

}
