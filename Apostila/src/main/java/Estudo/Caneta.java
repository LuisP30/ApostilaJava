package Estudo;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String modelo, String cor, float ponta){
        this.modelo=modelo;
        this.cor=cor;
        this.ponta=ponta;
        this.tampar();
        
    }
    public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String nomeModelo){
    this.modelo=nomeModelo;
    }
    public float getPonta(){
    return this.ponta;
    }
    public void setPonta(float ponta){
    this.ponta=ponta;
    }
    public void status(){
    System.out.println("SOBRE A CANETA:\n\nModelo: "+ this.modelo + "\nPonta: "+this.ponta+"\nCor: "+this.cor+"\nTampada: "+this.tampada);
    }
    public void tampar(){
    this.tampada=true;
    }
    public void destampar(){
    this.tampada=false;
    }
    
}
