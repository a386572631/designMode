package io.github.a386572631.designmode.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jjl
 * @DateTime 2023/6/23  14:03
 * @Description: Description
 */
@Slf4j
@Service("B")
public class BBooked extends AbstractBooked {
    @Override
    protected void business() {
        log.info("B业务...");
    }

    @Override
    protected boolean need_evaluated() {
        return false;
    }
}
