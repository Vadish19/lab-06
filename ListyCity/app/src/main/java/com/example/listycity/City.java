package com.example.listycity;

/**
 * This is a class that defines a City.
 **/

public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * This will create a city with a string of name and province
     *
     * @param city
     * The name of the city
     * @param province
     * The name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This will return the name of the city
     *
     * @return
     * Name of the city
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * This will return the name of the province
     *
     * @return
     * Name of the province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * This will compare current (this) city name to other city's name for sorting
     *
     * @param o
     * the other City to compare wth the current city
     * @return
     * Return a negative, zero or positive integer values
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This will check if current (this) city is equal to another city or object.
     *
     * @param o
     * the Object to compare with the current city
     * @return
     * Return true if city and province are the same, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ( o== null || getClass() != o.getClass()) {
            return false;
        }

        City city = (City) o;
        return this.city.equals(city.city) && this.province.equals(city.province);
    }
}
