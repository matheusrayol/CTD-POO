package com.company;

import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345", calendar.getTime());
        } catch (PatientException e) {
            System.err.println(e.getMessage());
        }

    }
}
