package com.glaFinalProject.service;

import com.glaFinalProject.common.model.LeaveRequestDTO;
import com.glaFinalProject.common.response.BaseRespDto;
import com.glaFinalProject.common.response.SuccessRespDto;
import com.glaFinalProject.mapper.LeaveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    private final LeaveMapper leaveMapper;

    @Autowired
    public LeaveService(LeaveMapper leaveMapper) {
        this.leaveMapper = leaveMapper;
    }

    public BaseRespDto leaveRequest(LeaveRequestDTO leaveRequestDTO) {
        leaveMapper.leaveRequest(leaveRequestDTO);
        return new SuccessRespDto();
    }


    public BaseRespDto leaveHistory() {
        SuccessRespDto successRespDto = new SuccessRespDto();
        List<LeaveRequestDTO> leaveRequestDTOS = leaveMapper.leaveHistory();
        successRespDto.setResp(leaveRequestDTOS);
        return successRespDto;
    }
}
