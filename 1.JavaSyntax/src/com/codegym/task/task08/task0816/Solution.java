package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        //map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        for (int i = 0; i < 10; i++) {
            map.put("Stallone" + i, df.parse("JUNE 1 198" + i));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        Calendar c = Calendar.getInstance();
        while (it.hasNext()) {
            Map.Entry<String, Date> entry = it.next();
            c.setTime(entry.getValue());
            if ((c.get(Calendar.MONTH) == 5) || c.get(Calendar.MONTH) == 6 || c.get(Calendar.MONTH) == 7) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
