/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguelcarro;

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
    Double dias = 1.0 * getQtdDias() ;
    
    public void iniciarLocacao(){
        new TelaCliente().setVisible(true);
    }

    public String mostrarResumoLocacao(){
        Double valor = dias * carro.getValor();
        String printValor;
        if (dias > 10.0 || dias >20.0){
            Double valorTotal = dias * (getKmInicial()+getKmFinal());
            Double desconto = valorTotal * 0.1;
            Double valorFinal = valor - desconto;
            System.out.println("Valor da Locacao:"+valor.toString()+"\n");
            printValor = "Valor da Locacao:"+valor.toString()+"\n";
        }
        if (dias >= 20.0){
            Double valorTotal = dias * (getKmInicial()+getKmFinal());
            Double desconto = valorTotal * 0.1;
            System.out.println("Valor da Locacao:"+valor.toString()+"\n");
            printValor = "Valor da Locacao:"+valor.toString()+"\n";
        }
        else{
            System.out.println("Valor da Locacao:"+valor.toString()+"\n");
            printValor = "Valor da Locacao:"+valor.toString()+"\n";
        } 
        return printValor;
        
    }
    public String fecharLocacao(){
        String msg = cliente.mostrarDadosUsuario();
        msg += carro.mostrarDadosCarro();
        msg += mostrarResumoLocacao();
        return msg;
        
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
