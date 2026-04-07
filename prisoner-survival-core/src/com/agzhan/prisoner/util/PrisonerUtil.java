package com.agzhan.prisoner.util;

import com.agzhan.prisoner.model.Prisoner;

import java.util.*;

public class PrisonerUtil {
    public static List<Prisoner> generatePrisoners(int count) {
        List<Prisoner> list = new ArrayList<>();
        Set<Integer> used = new HashSet<>();

        Random r = new Random();

        for (int i = 1; i <= count; i++) {
            int code;

            do {
                code = r.nextInt(200) + 1;
            } while (!used.add(code)); // Automatic deduplication

            list.add(new Prisoner(code, i));
        }
        return list;
    }
}
