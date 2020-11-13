package com.chao.feignclient.resource;


import com.chao.feignclient.client.MemberFeign;
import com.chao.feignclient.domain.cov.BuildEntity;
import com.chao.feignclient.domain.cov.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class CovFeignResource {

    @Autowired
    private MemberFeign memberFeign;

    @PostMapping(value = "/cov", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public BuildEntity sendody(@RequestBody Request request){

        log.info(request.toString());

        BuildEntity buildEntity = memberFeign.sendCovBody(request.getBuild_entity().get(0));

        return buildEntity;
    }

    @PostMapping(value = "/covList", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BuildEntity> sendCovBodyList(@RequestBody Request request){

        log.info(request.toString());

        List<BuildEntity> buildEntities = memberFeign.sendCovBodyList(request.getBuild_entity());
        return buildEntities;

    }

    /*
    打异常断点：FeignException，在class： SynchronousMethodHandler中搜索 response 可以看到请求结构和返回结构
     */
    @PostMapping(value = "/covListError", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BuildEntity> sendCovBodyListError(@RequestBody Request request){

        log.info(request.toString());

        List<BuildEntity> buildEntities = memberFeign.sendCovBodyListError(request.getBuild_entity());
        return buildEntities;

    }
}