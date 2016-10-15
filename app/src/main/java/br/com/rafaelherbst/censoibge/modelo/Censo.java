package br.com.rafaelherbst.censoibge.modelo;

import java.io.Serializable;

/**
 * Created by herbi on 14/10/2016.
 */

public class Censo implements Serializable{

    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private int homens;
    private int mulheres;
    private int criancas;
    private int idade;

    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public String getRua(){return rua;}

    public void setRua(String rua){this.rua = rua;}

    public int getNumero() {return numero;}

    public void setNumero(int numero) {this.numero = numero;}

    public String getBairro(){return bairro;}

    public void setBairro(String bairro) {this.bairro = bairro;}

    public int getHomens(){return homens;}

    public void setHomens(int homens){this.homens = homens;}

    public int getMulheres(){return mulheres;}

    public void setMulheres(int mulheres){this.mulheres = mulheres;}

    public int getCriancas(){return criancas;}

    public void setCriancas(int criancas){this.criancas = criancas;}

    public int getIdade(){return idade;}

    public void setIdade(int idade){this.idade = idade;}
}
