package org.example.java8quesrevision;

import java.util.List;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class Order {
    List<Item> items;

    Order(List<Item> items) {
        this.items = items;
    }

    List<Item> getItems() {
        return items;
    }
}
