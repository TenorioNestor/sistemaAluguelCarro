/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguelcarro;

import javax.swing.JOptionPane;

/**
 *
 * @author tayzeheidemanntenorio
 */
public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private Double valor;
    
    public String cadastrarCarro(){
        String infoCadastro = "Modelo: "+getModelo()+"\n";
        infoCadastro += "Marca: "+getMarca()+"\n";
        infoCadastro += "Valor por KM: "+String.valueOf(getValor())+"\n";
        return infoCadastro;
        
    }
    public String mostrarDadosCarro(){
        String carro = cadastrarCarro();
        System.out.println(cadastrarCarro());
        return carro;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}