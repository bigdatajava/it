package com.chao.eurekaservice.resource;

import com.chao.eurekaservice.domian.cov.BuildEntity;
import com.chao.eurekaservice.domian.cov.CovResult;
import com.chao.eurekaservice.domian.response.OrderResponse;
import com.chao.eurekaservice.domian.response.TicketResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class CovResource {

    @PostMapping(value = "/cov", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public BuildEntity sendCovBody(@RequestBody BuildEntity buildEntity){

        log.info(buildEntity.toString());

        return buildEntity;
    }


    @PostMapping(value = "/covList", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<BuildEntity> sendCovBody(@RequestBody List<BuildEntity> buildEntity){

        log.info(buildEntity.toString());
        return buildEntity;
    }
}
