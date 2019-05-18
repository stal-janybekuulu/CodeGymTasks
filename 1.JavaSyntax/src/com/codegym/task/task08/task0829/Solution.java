package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> citiesWithFamily = new HashMap<String, String>() {};

        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) break;

            String family = scanner.nextLine();
            if (family.isEmpty()) break;

            citiesWithFamily.put(city, family);
        }

        String town = scanner.nextLine();

        for (String k: citiesWithFamily.keySet()) {
            if (town.equals(k)) {
                System.out.println(citiesWithFamily.get(k));
            }
        }


        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familyName = addresses.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
