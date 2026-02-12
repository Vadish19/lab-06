package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This will check if a city is present in the list
     *
     * @param city
     * city to check from the list if it exists or not
     * @return
     * Return true if the city exists, otherwise false
     */

    public boolean hasCity(City city) {
        if (cities.contains(city)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * This removes a city from the list if the city does exist already
     *
     * @param city
     * This is a candidate city to delete
     * @throws IllegalArgumentException
     * Throws an error if the city does not exist
     */

    public void delete (City city){
        if (cities.contains(city)){
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This will count how many cities exist in the list
     *
     * @return
     * Return the number of cities in the list
     */

    public int countCities() {
         int count_city = 0;
         for (City city: cities){
         count_city++;
         }
         return count_city;
    }
}
