package com.glaFinalProject.mapper;

import com.glaFinalProject.common.model.LeaveRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveMapper {

    List<LeaveRequestDTO> applyLeave();

    void leaveRequest(LeaveRequestDTO leaveRequestDTO);

    List<LeaveRequestDTO> leaveHistory();
}
