package com.glaFinalProject.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequestDTO {
    private Long id;
    private Long employeeId;
    private String reason;
    private String leaveType;
    private String status;
    private Date startDate;
    private Date endDate;
    private String registeredDate;

}
