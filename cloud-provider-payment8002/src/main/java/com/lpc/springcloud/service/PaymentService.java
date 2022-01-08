package com.lpc.springcloud.service;

import com.lpc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author byu_rself
 * @date 2022/1/7 11:31
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
