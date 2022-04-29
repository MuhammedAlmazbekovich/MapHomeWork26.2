package com.company;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class City {
    private Integer code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(code, city.code) && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "City" + " code = " + code +  ", name = " + name ;
    }


}
