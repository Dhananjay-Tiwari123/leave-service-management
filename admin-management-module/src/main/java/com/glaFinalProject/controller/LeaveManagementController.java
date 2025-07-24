package com.glaFinalProject.controller;


import com.glaFinalProject.response.BaseRespDto;
import com.glaFinalProject.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveManagementController {

    private final LeaveService leaveService;


    @Autowired
    public LeaveManagementController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }


//    @PostMapping("/api/leave/approveleave")
//    public void approveLeave() {
//
//
//    }


    @GetMapping("/api/leaves/pendingleaves")
    public BaseRespDto getPendingLeaves() {
        return leaveService.getPendingLeaves();
    }


}
