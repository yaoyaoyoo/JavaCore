package com.spring.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    private static final Pattern pattern1 = Pattern.compile("(?<=\")([\\S ]+?)(?=\")");

    public static void main(String[] args) {
        String str = "port = (switchUuid = \"50 25 07 90 77 a9 c1 df-d1 2b f2 b1 e6 cd 9c 42\", portgroupKey = \"dvportgroup-205\", portKey = \"6\", connectionCookie = 1881955814)";
        String str2 = "config.hardware.device(40).backing.port.portgroupKey: \"dvportgroup-205\" -> \"dvportgroup-233\";";
        System.out.println(str2.substring(str2.indexOf('(') + 1, str2.indexOf(')')));
        Matcher matcher = pattern1.matcher(str2);
        List<String> list =  new ArrayList<>();
        while (matcher.find()) {
            String value = matcher.group();
            if (value.trim().equals(("->"))) {
                continue;
            }
            System.out.println(value);
            list.add(value);
        }
        System.out.println(list);
        str = str.substring(str.indexOf("switchUuid"));
        String dvs = get(str);

        str = str.substring(str.indexOf("portgroupKey"));
        String pg = get(str);

        str = str.substring(str.indexOf("portKey"));
        String pk = get(str);
//        matcher.find()
        String a = "[1,2,3]";
        System.out.println(a.replaceAll("\\[","").replaceAll("]",""));
    }

    private static String get(String string) {
        Matcher matcher = pattern1.matcher(string);
        if (matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
            return s;
        }
        return null;
    }
}
