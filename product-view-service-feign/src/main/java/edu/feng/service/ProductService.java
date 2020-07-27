package edu.feng.service;

import edu.feng.client.ProductClientFeign;
import edu.feng.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: clouddemo1
 * @description: feign方式
 * @author: feng
 * @create: 2020-05-01 16:16
 */
@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProducts();
    }


}