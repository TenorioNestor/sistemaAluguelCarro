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
public class Aluguel  {
    
    Carro carro = new Carro();
    Cliente cliente = new Cliente();
    private String id;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private Double valorTotalAluguel;
    private Double valorPorKm;

    Double dias = 1.0 * getQtdDias() ;
    
    
    public void iniciarLocacao(){
        new TelaCliente().setVisible(true);
    }

    public void mostrarResumoLocacao(){
        Carro carro = new Carro();
        int kmRodado = getKmFinal() - getKmInicial();
        //Double valorTotal = kmRodado * carro.getValor();
        String msg = "Km Inicial: "+Integer.toString(getKmInicial())+"\n";
        msg+="Km Final: "+Integer.toString(getKmFinal())+"\n";
        msg+="Quantidade de dias: "+Integer.toString(getQtdDias())+"\n";
        msg+="Km rodado: "+kmRodado+"\n";
        msg+="Valor totaol sem desconto: "+carro.getMarca()+"\n";

        System.out.println(msg);
    }
    public String fecharLocacao(){
        String msg = cliente.mostrarDadosUsuario();
        msg += carro.mostrarDadosCarro();
        return msg;
        
    }
    
    
    public Double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(Double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public Double getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(Double valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }
    
    
    
    
    
}
