package com.lpc.springcloud.service.impl;

import com.lpc.springcloud.dao.PaymentDao;
import com.lpc.springcloud.entities.Payment;
import com.lpc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author byu_rself
 * @date 2022/1/7 11:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
