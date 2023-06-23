package io.github.a386572631.designmode.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

/**
 * @author jjl
 * @DateTime 2023/6/23  14:06
 * @Description: Description
 */
@Slf4j
@Service
public class BookedFactory {

    @Autowired
    Map<String, AbstractBooked> abstractBookedMap;

    public AbstractBooked get(String name) {
        AbstractBooked abstractBooked = abstractBookedMap.get(name);
        if(Objects.isNull(abstractBooked)){
            throw new RuntimeException("Error...");
        }
        return abstractBooked;
    }
}
