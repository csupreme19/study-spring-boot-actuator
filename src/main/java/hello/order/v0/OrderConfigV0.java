package hello.order.v0;

import hello.order.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV0 {

    @Bean
    OrderService orderServiceV0() {
        return new OrderServiceV0();
    }
}
