package com.example.test;

import java.sql.Array;

public class ArrayTest01 {

    public static void main(String[] args) {

        int [] i = {12,123,1234,12345};

        System.out.println(i.length);

        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }

    }
}
