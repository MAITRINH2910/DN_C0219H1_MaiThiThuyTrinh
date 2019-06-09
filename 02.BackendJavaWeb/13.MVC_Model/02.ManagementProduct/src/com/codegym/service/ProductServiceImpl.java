package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
        static{
            products = new HashMap<>();
            products.put(1, new Product(1,"kem đánh răng",10000,"dùng cho người lớn", "Nhật Bản"));
            products.put(2, new Product(2,"quần tây",250000,"giới trẻ", "Việt Nam"));
            products.put(3, new Product(3,"áo sơ mi",150000,"giáo viên", "Trung Quốc"));

        }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){
        products.put(product.getId(), product);
    }

    @Override
    public Product findByName(String nameProduct){
        return products.get(nameProduct);
    }
    @Override
    public void update(int id, Product product){
        products.put(id, product);
    }

    @Override
    public void remove(int id){
        products.remove(id);
    }

    @Override
    public Product findById(int id){ return products.get(id);}

}
