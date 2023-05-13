package com.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.shoping.entity.Product;

@Repository


public interface ProductRepository extends JpaRepository<Product, ID> {

}
