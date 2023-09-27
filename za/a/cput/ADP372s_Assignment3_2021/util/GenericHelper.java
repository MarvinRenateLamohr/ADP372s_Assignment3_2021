package za.a.cput.ADP372s_Assignment3_2021.util;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import java.util.UUID;

public class GenericHelper {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
