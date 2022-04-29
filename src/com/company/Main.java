package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/* City деген класс тузунуз. (code, name, ...)
    Эгерде code так сан болсо TreeSet ke салыныз.
    Аларды чонунан кичинесине караган тартипте чыгарыныз */


        City city = new City(1, "OSH");
        City city2 = new City(2, "Tokmok");
        City city3 = new City(3, "Bishkek");
        City city4 = new City(4, "Jalal-Abad");

        Set <City> cities = new HashSet<>();

        cities.add(city);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);

        Iterator <City> cityIterator = cities.iterator();
        while (cityIterator.hasNext()){
            if (cityIterator.next().getCode() % 2 == 0){
                cityIterator.remove();
            }
        }

        for (City gorod : cities ) {
            System.out.println(gorod);
        }


    }

}
