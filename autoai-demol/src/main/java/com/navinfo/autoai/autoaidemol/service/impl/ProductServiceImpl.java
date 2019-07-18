package com.navinfo.autoai.autoaidemol.service.impl;
import com.navinfo.autoai.autoaidemol.domain.Product;
import com.navinfo.autoai.autoaidemol.mapper.ProductMapper;
import com.navinfo.autoai.autoaidemol.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}