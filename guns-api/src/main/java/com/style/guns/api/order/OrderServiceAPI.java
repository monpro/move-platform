package com.style.guns.api.order;

import com.baomidou.mybatisplus.plugins.Page;
import com.style.guns.api.order.vo.OrderVO;

public interface OrderServiceAPI {

    boolean isTrueSeats(String fieldId, String seats);

    boolean isNotSoldSeats(String fieldId, String seats);

    OrderVO saveOrderInfo(Integer fieldId, String soldSeats, String seatsName, Integer userId);

    Page<OrderVO> getOrderByUserId(Integer userId, Page<OrderVO> page);

    String getSoldSeatsByFieldId(Integer fieldId);

    OrderVO getOrderInfoById(String orderId);
}
