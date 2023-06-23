package io.github.a386572631.designmode.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jjl
 * @DateTime 2023/6/23  13:57
 * @Description: Description
 */
@Slf4j
@Service
public abstract class AbstractBooked {
    public void template() {
        this.booked();
        this.signed();
        this.business();
        if (this.need_evaluated()) {
            this.evaluated();
        }
    }

    protected void booked() {
        log.info("预约了...");
    }

    protected void signed() {
        log.info("签到了...");
    }

    protected void evaluated() {
        log.info("评价了...");
    }

    protected abstract void business();

    protected abstract boolean need_evaluated();
}
