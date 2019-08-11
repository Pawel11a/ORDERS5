package companyx.orders.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@RequiredArgsConstructor
@Transactional
public class CustomerOrderService {

    public void test(){

        System.out.println("NOWE");
        System.out.println("START");
    }

}
