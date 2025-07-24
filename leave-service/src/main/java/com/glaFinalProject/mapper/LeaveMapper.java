package com.glaFinalProject.mapper;

import com.glaFinalProject.common.model.LeaveBalanceDTO;
import com.glaFinalProject.common.model.LeaveRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LeaveMapper {

    List<LeaveRequestDTO> applyLeave();

    void leaveRequest(LeaveRequestDTO leaveRequestDTO);

    List<LeaveRequestDTO> leaveHistory();

    List<Integer> getEmpId();

    void insertLeaveBalance(LeaveBalanceDTO leaveBalanceDTO);

    int leaveBalance(@Param("empId") int empId);

    List<LeaveRequestDTO> pendingLeave();

}
