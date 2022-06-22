package com.company;

import java.util.Date;


public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345", new Date(2022,6,22));
        } catch (PatientException e) {
            System.err.println(e.getMessage());
        }

    }
}
