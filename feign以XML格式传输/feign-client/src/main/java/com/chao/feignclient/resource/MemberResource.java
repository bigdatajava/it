package com.chao.feignclient.resource;

import com.chao.feignclient.client.MemberFeign;
import com.chao.feignclient.domain.Member;
import com.chao.feignclient.domain.request.TicketRequest;
import com.chao.feignclient.domain.response.TicketResponse;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberResource {

    @Autowired
    private MemberFeign memberFeign;

    @GetMapping("/getUserList")
    public List<String> getUserList(){
        List<String> orderByUserList = memberFeign.getOrderByUserList(new Member("liuwc9",24,true));
        return orderByUserList;
    }

    @PostMapping(value = "/test", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public TicketResponse test(@RequestBody TicketRequest ticketRequest){
        TicketResponse ticketResponse = memberFeign.test(ticketRequest);
        return ticketResponse;
    }
}
