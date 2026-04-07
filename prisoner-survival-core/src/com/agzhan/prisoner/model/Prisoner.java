package com.agzhan.prisoner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prisoner {
    private int id; // Random numbering of prisoners
    private int firstLocation; // The location where the prisoner first appearance

    @Override
    public String toString() {
        return "[" + id + "]";
    }
}