package com.heyongqiang.work.vo.params;


import lombok.Data;

import javax.annotation.sql.DataSourceDefinitions;

@Data
public class FlightSearchParams {

    private String beginCity;

    private String endCity;

    private Integer day;

    private Integer pageSize;

//    当前页
    private Integer pageNum;

}