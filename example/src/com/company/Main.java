package com.company;


import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// sample using

        libUtp lol = new libUtp();

        lol.port = "20000";
         lol.token =  "119C91A00340B54F7AD4C7DB40E9B9E3";

        System.out.println(lol.getSystemInfo());
         System.out.println(lol.getReleaseNotes());
    }
}

