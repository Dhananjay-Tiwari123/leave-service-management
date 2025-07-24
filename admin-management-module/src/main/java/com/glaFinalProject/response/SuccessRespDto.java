package com.glaFinalProject.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessRespDto extends BaseRespDto{

    public SuccessRespDto(){
        super("ok",new MessageDTO());
    }

    public SuccessRespDto (String rsp){
        super("ok", new MessageDTO(rsp));
    }
}
