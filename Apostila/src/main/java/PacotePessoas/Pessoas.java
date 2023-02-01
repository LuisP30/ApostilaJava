package PacotePessoas;
public class Pessoas {
   private String nome;
   private int idade;
   private String sexo;
   
   //Métodos
   public void fazerAniversario(){
   this.idade++;
   }
   
   //Métodos especiais
   public String getNome(){
   return this.nome;
   }
   public int getIdade(){
   return this.idade;
   }
   public String getSexo(){
   return this.sexo;
   }
   public void setNome(String nome){
   this.nome=nome;
   }
   public void setIdade (int idade){
   this.idade=idade;
   }
   public void setSexo(String sexo){
   this.sexo=sexo;
   }
}
