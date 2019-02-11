package com.uniovi.repositories;

import com.uniovi.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, Long>{

}
