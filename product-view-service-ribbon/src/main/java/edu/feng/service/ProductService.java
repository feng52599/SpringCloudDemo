package edu.feng.service;

import edu.feng.client.ProductClientRibbon;
import edu.feng.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: clouddemo1
 * @description: 数据从productRibbon获取
 * @author: feng
 * @create: 2020-05-01 15:44
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();
    }

}