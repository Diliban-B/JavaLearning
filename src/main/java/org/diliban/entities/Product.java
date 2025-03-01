package org.diliban.entities;

import java.util.Comparator;

public class Product implements Comparable {
    private String name;
    private int price;




    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Product)o).getName());
    }
}
