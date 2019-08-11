package companyx.orders.model;
import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
@Entity
@Table(name = "customer_order")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="customerOrder", sequenceName = "customer_order_seq", allocationSize=5)

    private BigInteger id;
    private LocalDateTime date;
    private BigDecimal discount;

    private Integer quantity;
    private BigInteger customer_id;
    private BigInteger payment_id;
    private BigInteger product_id;


}
