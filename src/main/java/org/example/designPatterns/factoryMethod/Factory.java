package org.example.designPatterns.factoryMethod;

import java.util.Optional;

public interface Factory {

    Optional<Product> factoryMethod(String type);
}
