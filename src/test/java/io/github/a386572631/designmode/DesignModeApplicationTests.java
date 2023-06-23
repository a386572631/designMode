package io.github.a386572631.designmode;

import io.github.a386572631.designmode.template.AbstractBooked;
import io.github.a386572631.designmode.template.BookedFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignModeApplicationTests {

    @Autowired
    BookedFactory bookedFactory;

    @Test
    void contextLoads() {
        bookedFactory.get("A").template();
        System.out.println("-----------------------------");
        bookedFactory.get("B").template();
    }

}
