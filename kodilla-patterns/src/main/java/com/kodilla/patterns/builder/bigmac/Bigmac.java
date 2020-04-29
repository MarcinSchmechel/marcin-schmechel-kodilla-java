package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun; // sezam, zwykłą
    private final int burgers; // ilość burgerów
    private final Sauce sauce; //none, standard, 1000 wysp, barbecue
    private final List<String> ingredients; //sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser

    private Bigmac(String bun, int burgers, Sauce sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }
    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgersQuantity(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSause() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sause='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}