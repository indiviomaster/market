package ru.indivio.market.utils;

import ru.indivio.market.entities.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }
}
