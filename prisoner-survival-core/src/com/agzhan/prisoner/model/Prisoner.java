package com.agzhan.prisoner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prisoner {
    private int id; // 囚犯的随机编号
    private int firstLocation; // 囚犯第一次出现的位置

    @Override
    public String toString() {
        return "(id: " + id + ", firstLocation: " + firstLocation + ")";
    }
}