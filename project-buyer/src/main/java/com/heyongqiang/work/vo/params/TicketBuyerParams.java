package com.heyongqiang.work.vo.params;


import lombok.Data;

@Data
public class TicketBuyerParams {

    private Integer price;

    private Integer grade;

    private Long flightId;

    private Integer seat;

    private String day;

}