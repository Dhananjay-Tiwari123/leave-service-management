package com.glaFinalProject.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveBalanceDTO {

    private int employeeId;
    private String month;
    private String year;
    private String leaveBalance;
    private String leaveType;
    private String totalLeave;
    private String  usedLeave;
    private String reminingLeave;


}
