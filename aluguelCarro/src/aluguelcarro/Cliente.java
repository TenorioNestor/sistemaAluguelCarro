/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguelcarro;

/**
 *
 * @author tayzeheidemanntenorio
 */
public class Cliente {
    private int id = 0;
    private String nome;
    private String cpf;
    private String telefone;
    
    public String cadastrarUsuario(){
        String addDados = "Cliente\nNome:"+getNome()+"\n";
        addDados += "CPF:"+getCpf()+"\n";
        addDados += "Telefone:"+getTelefone()+"\n";
        return addDados;
    }
    
    public String mostrarDadosUsuario(){
        System.out.println(cadastrarUsuario());
        String user = cadastrarUsuario();
        return user;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
