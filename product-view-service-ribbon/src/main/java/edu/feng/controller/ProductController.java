package edu.feng.controller;

import edu.feng.pojo.Product;
import edu.feng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: clouddemo1
 * @description: 数据取出放到product.html
 * @author: feng
 * @create: 2020-05-01 15:47
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object getProducts(Model model) {
        List<Product> ps = productService.listProducts();
        model.addAttribute("ps", ps);
        return "products";
    }
}