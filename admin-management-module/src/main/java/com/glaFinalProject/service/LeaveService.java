package com.glaFinalProject.service;

import com.glaFinalProject.mapper.LeaveMapper;
import com.glaFinalProject.response.BaseRespDto;
import com.glaFinalProject.response.SuccessRespDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class LeaveService {

    private final LeaveMapper leaveMapper;


    @Autowired
    public LeaveService(LeaveMapper leaveMapper) {
        this.leaveMapper = leaveMapper;

    }


    public BaseRespDto getPendingLeaves() {
        SuccessRespDto successRespDto = new SuccessRespDto();
        ResponseEntity<SuccessRespDto> leaveRequest = new RestTemplate().getForEntity("http://localhost:8081/api/leave/pendingleaves", SuccessRespDto.class);
        successRespDto.setResp(leaveRequest.getBody().getResp());
        return successRespDto;

    }


}
