package com.chao.eurekaservice.domian.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName ="message")
public class TicketRequest {

    @JacksonXmlElementWrapper(localName ="orderlist")
    @JacksonXmlProperty(localName ="order")
    private List<OrderRequest> orderList;

    public List<OrderRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderRequest> orderList) {
        this.orderList = orderList;
    }

}

/*

<message>
  <orderlist>
    <order>
      <lotterytype>2004</lotterytype>
      <phase>201409209</phase>
      <orderid>zy2014090234322</orderid>
      <playtype>200401</playtype>
      <betcode>00,02,03,04,05,06,07^</betcode>
      <multiple>1</multiple>
      <amount>2</amount>
      <add>0</add>
      <endtime>结束时间</endtime>
    </order>
  </orderlist>
</message>
 */