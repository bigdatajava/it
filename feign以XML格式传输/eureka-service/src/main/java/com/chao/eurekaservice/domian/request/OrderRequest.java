package com.chao.eurekaservice.domian.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class OrderRequest {

    public String lotteryType;

    public String phase;

    @JacksonXmlProperty(localName = "lotterytype")
    public String getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType = lotteryType;
    }

    @JacksonXmlProperty(localName = "phase")
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
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