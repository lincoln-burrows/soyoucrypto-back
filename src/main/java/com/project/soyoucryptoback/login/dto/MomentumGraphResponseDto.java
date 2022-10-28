package com.project.soyoucryptoback.login.dto;

import com.project.soyoucryptoback.login.model.MomentumDataAll;
import com.project.soyoucryptoback.login.model.MomentumOutputIndex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class MomentumGraphResponseDto {
    private List<MomentumDataAll> momentumDataAll;
    private List<MomentumOutputIndex> indexAll;


    public MomentumGraphResponseDto(List<MomentumDataAll> momentumDataAll, List<MomentumOutputIndex> indexAll) {
        this.momentumDataAll = momentumDataAll;
        this.indexAll = indexAll;

    }
}