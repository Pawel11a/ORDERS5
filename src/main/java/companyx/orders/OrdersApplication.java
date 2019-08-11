package companyx.orders;

import companyx.orders.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class OrdersApplication implements CommandLineRunner{

	@Autowired
	CustomerOrderService customerOrderService;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

//	customerOrderService.
//access command line arguments
@Override
public void run(String... args) throws Exception {


	customerOrderService.test();
	//do something

}

}
