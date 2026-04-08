package com.agzhan.prisoner.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    public static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String now() {
        return LocalDateTime.now().format(FORMATTER);
    }

    public static void info(String msg) {
        System.out.println("[INFO]" + now() + " - " + msg);
    }

    public static void error(String msg) {
        System.out.println("[ERROR]" + now() + " - " + msg);
    }
}
