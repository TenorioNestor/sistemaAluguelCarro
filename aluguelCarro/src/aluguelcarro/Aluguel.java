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
    TelaCadastro cad = new TelaCadastro();
    Carro carro = new Carro();
    Cliente cliente = new Cliente();
    private String id;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private Double valorPorKm;
    private String msg;

 
    
    public void iniciarLocacao(){
        new TelaCliente().setVisible(true);
    }

    public void mostrarResumoLocacao(){
        Double valorTotalAluguel;
        Carro carro = new Carro();
        int kmRodado = getKmFinal() - getKmInicial();
        Double valorTotalKm = kmRodado * getValorPorKm();
        valorTotalAluguel =  valorTotalKm * getQtdDias();
        if (getQtdDias()>10 && getQtdDias()<19){
            Double desconto = valorTotalAluguel * 0.1;
            System.out.println("Dias="+getQtdDias()+"\n");
            valorTotalAluguel = valorTotalAluguel - desconto;
        }else if (getQtdDias()>=20){
            Double desconto = valorTotalAluguel * 0.2;
            System.out.println("ValorAluguel="+desconto+"\n");
            valorTotalAluguel = valorTotalAluguel - desconto;
        }
        String msg ="Aluguel\nQuantidade de dias: "+Integer.toString(getQtdDias())+"\n";
        msg+="Km Inicial: "+Integer.toString(getKmInicial())+"\n";
        msg+="Km Final: "+Integer.toString(getKmFinal())+"\n";
        msg+="Valor por Km: "+String.valueOf(getValorPorKm())+"\n";
        msg+="Valor Total: "+String.valueOf(valorTotalAluguel)+"\n";
        System.out.println(msg);
        
    }
    public void fecharLocacao(){
        JOptionPane.showMessageDialog(null, "Todas as informações foram impressas no Output!");
        
        
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


       public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
    
    
}
