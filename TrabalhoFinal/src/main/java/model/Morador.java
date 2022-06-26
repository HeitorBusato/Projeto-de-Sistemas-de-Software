/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Heitor
 */
public class Morador {
    
    private String nome;
    private String apelido ;
    private String telefone;
    private String cpf;
    private String contato1;
    private String contato2;
    
    private Republica republica;
    
    public Morador() {
    }

    public Morador(String nome, String apelido, String telefone, String cpf, String contato1, String contato2) {
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.cpf = cpf;
        this.contato1 = contato1;
        this.contato2 = contato2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato1() {
        return contato1;
    }

    public void setContato1(String contato1) {
        this.contato1 = contato1;
    }

    public String getContato2() {
        return contato2;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }

    public Republica getRepublica() {
        return republica;
    }

    public void setRepublica(Republica republica) {
        this.republica = republica;
    }
    
    @Override
    public String toString() {
        return "Morador{" + "nome: " + nome + ", apelido: " + apelido + ", telefone: " + telefone + ", cpf: " + cpf + ", contato1: " + contato1 + ", contato2: " + contato2 + '}';
    }

}
