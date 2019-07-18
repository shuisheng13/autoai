package com.navinfo.autoai.autoaidemol.mapper;


import com.navinfo.autoai.autoaidemol.domain.Product;

import java.util.List;

public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}