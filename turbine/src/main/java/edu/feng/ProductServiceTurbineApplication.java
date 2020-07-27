package edu.feng;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * turbine的作用是将一个集群里的多个示例汇聚在一个turbine里然后再在断路器监控里查看这个turbine, 这样就能够在集群层面进行监控
 * *
 */
@SpringBootApplication
@EnableTurbine
public class ProductServiceTurbineApplication {
    public static void main(String[] args) {
        int port = 8021;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductServiceTurbineApplication.class).properties("server.port=" + port).run(args);
    }

}