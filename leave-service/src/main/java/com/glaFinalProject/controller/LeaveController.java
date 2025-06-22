package com.glaFinalProject.controller;
import com.glaFinalProject.common.model.LeaveRequestDTO;
import com.glaFinalProject.common.response.BaseRespDto;
import com.glaFinalProject.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    private final LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @GetMapping("/api/leave/applyleave")
    public BaseRespDto applyLeave(@RequestBody LeaveRequestDTO leaveRequestDTO) {
        return leaveService.leaveRequest(leaveRequestDTO);
    }

    @GetMapping("/api/leave/leaveHistory/{employeeId}")
    public BaseRespDto leaveHistory(@PathVariable String employeeId){

       return leaveService.leaveHistory();

    }

}
