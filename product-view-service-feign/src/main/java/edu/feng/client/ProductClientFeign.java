package edu.feng.client;

import edu.feng.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: clouddemo1
 * @description: Feign方式访问
 * @author: feng
 * @create: 2020-05-01 16:20
 */
// 此注解说明是服务调用 value 是调用服务名
//    当数据微服务调用失败时就会调用断路器类，
@FeignClient(value = "PRODUCT-DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
    @GetMapping("products")
    public List<Product> listProducts();
}