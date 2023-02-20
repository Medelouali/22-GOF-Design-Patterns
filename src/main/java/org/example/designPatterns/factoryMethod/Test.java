package org.example.designPatterns.factoryMethod;

import java.util.Optional;

public class Test {

    public void run(){
        String type="Design";
        DesignProduct designProduct=new DesignProduct();
        FashionProduct fashionProduct=new FashionProduct();
        FoodProduct foodProduct=new FoodProduct();

        Optional<Product> product=new ProductFactory().factoryMethod(type);
        if(product.isPresent()){
            System.out.println("It's one of the types");
        }else{
            System.out.println("Whoops it an unknown type");
        }
    }
}
