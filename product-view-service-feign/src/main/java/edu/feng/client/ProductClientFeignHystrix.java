package edu.feng.client;

import edu.feng.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: clouddemo1
 * @description: 断路器
 * @author: feng
 * @create: 2020-05-10 08:57
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }
}