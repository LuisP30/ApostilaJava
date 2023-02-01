package PacotePessoas;
public class Funcionario extends Pessoas {
    private String setor;
    private boolean trabalhando;
    
    public void mudaTrabalho(){
    this.trabalhando = !this.trabalhando;
    }
    public String getSetor(){
    return setor;
    }
    public void setSetor(String setor){
    this.setor=setor;
    }
    public boolean getTrabalhando(){
    return trabalhando;
    }
    public void setTrabalando (boolean trabalhando){
    this.trabalhando = trabalhando;
    }
    @Override
    public String toString(){
    return "Pessoa{" + "nome=" + nome + ", idade" + idade +", sexo"+ sexo;}"
    }
}
