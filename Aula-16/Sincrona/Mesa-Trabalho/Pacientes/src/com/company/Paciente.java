package com.company;

import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PatientException {
        Date hoje = new Date(2022, 6, 21);
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        this.dataInternacao = dataInternacao;
        if (this.dataInternacao.after(hoje)) {
            throw new PatientException("Data de internação inválida!");
        }
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta)
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            System.out.println("Não pode");
    }



}
