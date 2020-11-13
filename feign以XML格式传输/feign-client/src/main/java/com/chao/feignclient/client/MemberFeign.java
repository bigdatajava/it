package com.chao.feignclient.client;

import com.chao.feignclient.domain.Member;
import com.chao.feignclient.domain.cov.BuildEntity;
import com.chao.feignclient.domain.request.TicketRequest;
import com.chao.feignclient.domain.response.TicketResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("eureka-service")
public interface MemberFeign {

	@GetMapping(value = "/getUserList",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_XML_VALUE)
	public List<String> getOrderByUserList(Member member);

	@PostMapping(value = "/test", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public TicketResponse test(@RequestBody TicketRequest ticketRequest);


	@PostMapping(value = "/cov", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public BuildEntity sendCovBody(@RequestBody BuildEntity buildEntity);

	@PostMapping(value = "/covList", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<BuildEntity> sendCovBodyList(@RequestBody List<BuildEntity> buildEntity);


	@PostMapping(value = "/covListError", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<BuildEntity> sendCovBodyListError(@RequestBody List<BuildEntity> buildEntity);

}