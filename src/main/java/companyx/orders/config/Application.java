package companyx.orders.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("companyx.orders.repository")
@EntityScan("companyx.orders.model")
@SpringBootApplication
public class Application {

}
