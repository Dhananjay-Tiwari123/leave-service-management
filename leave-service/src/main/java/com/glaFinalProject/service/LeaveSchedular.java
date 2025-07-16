package com.glaFinalProject.service;

import com.glaFinalProject.common.model.LeaveBalanceDTO;
import com.glaFinalProject.mapper.LeaveMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class LeaveSchedular {

    private LeaveMapper leaveMapper;

    public LeaveSchedular(LeaveMapper leaveMapper) {
        this.leaveMapper = leaveMapper;
    }

    @Scheduled(cron = "0 0 0 L * ?")
    public void insertLeaveBalance() {
        LeaveBalanceDTO leaveBalanceDTO = new LeaveBalanceDTO();
        List<Integer> empIdList = leaveMapper.getEmpId();

        empIdList.forEach(f -> {
            leaveBalanceDTO.setMonth(LocalDate.now().getMonth().toString());
            leaveBalanceDTO.setLeaveBalance("2");
            leaveBalanceDTO.setEmployeeId(f);
            leaveBalanceDTO.setUsedLeave("0");
            leaveBalanceDTO.setReminingLeave("2");
            leaveBalanceDTO.setYear(Integer.valueOf(LocalDate.now().getYear()).toString());
            leaveBalanceDTO.setLeaveType("EL");
            leaveBalanceDTO.setTotalLeave("2");
            leaveMapper.insertLeaveBalance(leaveBalanceDTO);

        });


        System.out.println(leaveBalanceDTO);


    }


}
