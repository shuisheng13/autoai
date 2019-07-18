package com.navinfo.autoai.autoaidemol.service;


import com.navinfo.autoai.autoaidemol.domain.Product;

import java.util.List;

public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}