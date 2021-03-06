package com.devd.spring.bookstore.order.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.devd.spring.bookstore.order.repository.dao.OrderBillingAddress;
import com.devd.spring.bookstore.order.repository.dao.OrderItem;
import com.devd.spring.bookstore.order.repository.dao.OrderShippingAddress;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-09-20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponse {
    private String orderId;
    private List<OrderItem> orderItems = new ArrayList<>();
    private OrderShippingAddress shippingAddress;
    private OrderBillingAddress billingAddress;
    private Card card;
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
    private boolean isPaid;
    private LocalDateTime paymentDate;
    private boolean isDelivered;
    private String paymentReceiptUrl;
    private LocalDateTime deliveredDate;
    private Date created_at;
}
