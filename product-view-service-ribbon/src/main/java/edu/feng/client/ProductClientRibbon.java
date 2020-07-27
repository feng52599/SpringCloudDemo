package edu.feng.client;

import java.util.List;

import edu.feng.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @program: clouddemo1
 * @description: Ribbon 客户端
 * @author: feng
 * @create: 2020-05-01 15:40
 */


// Ribbon 是使用 restTemplate 进行调用，并进行客户端负载均衡
// 通过 restTemplate 访问 http://PRODUCT-DATA-SERVICE/products ，
// 而 product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
// 在这里并没有指定dataservice的端口，只是指定了名称
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }

}