package edu.feng.controller;

import edu.feng.pojo.Product;
import edu.feng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: clouddemo1
 * @description:
 * @author: feng
 * @create: 2020-05-01 16:40
 */

@Controller
@RefreshScope
public class ProductController {
    @Autowired
    ProductService productService;
    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object getProducts(Model model) {
        List<Product> ps = productService.listProducts();
        model.addAttribute("version", version);
        model.addAttribute("ps", ps);
        return "products";
    }
}