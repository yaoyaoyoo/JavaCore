package com.spring.factory.abstractfactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    private static final Pattern pattern1 = Pattern.compile("(?<=\")([\\S]+?)(?=\")");

    public static void main(String[] args) {
        String str = "config.hardware.device(4000).backing.port.portgroupKey: \"dvportgroup-31\" -> \"dvportgroup-51\"";
        Matcher matcher = pattern1.matcher(str);
//        matcher.find()
    }
}
