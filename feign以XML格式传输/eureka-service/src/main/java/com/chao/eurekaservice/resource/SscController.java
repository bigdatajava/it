package com.chao.eurekaservice.resource;

import com.chao.eurekaservice.domian.request.TicketRequest;
import com.chao.eurekaservice.domian.response.OrderResponse;
import com.chao.eurekaservice.domian.response.TicketResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SscController {

    @PostMapping(value = "/test", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public TicketResponse test(@RequestBody TicketRequest ticketRequest){
        TicketResponse ticketResponse=new TicketResponse();
        List<OrderResponse> orders=new ArrayList<OrderResponse>();
        OrderResponse o=new OrderResponse();
        o.setMsg("投注成功");
        orders.add(o);
        ticketResponse.setOrderList(orders);
        return ticketResponse;
    }

}