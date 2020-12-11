package com.style.guns.api.order.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderVO implements Serializable {

    private String orderId;
    private String fileName;
    private String fieldTime;
    private String cinemaTime;
    private String seatsName;
    private String orderPrice;
    private String orderTimestamp;
    private String orderStatus;
}
