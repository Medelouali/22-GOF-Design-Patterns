package org.example.designPatterns.factoryMethod;

import java.util.Optional;

public class ProductFactory  implements Factory{
    @Override
    public Optional<Product> factoryMethod(String type) {
        if(type=="Design")return Optional.of(new DesignProduct());
        if(type=="Fashion")return Optional.of(new FashionProduct());
        if(type=="Food")return Optional.of(new FoodProduct());
        return Optional.ofNullable(null);
    }
}
