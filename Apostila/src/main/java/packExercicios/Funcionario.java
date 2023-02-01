package packExercicios;
public class Funcionario {
private String nome;
private String departamento;
private double salario;
private String dataEntrada;
private String rg;
private boolean estaNaEmpresa;
private int id = 0;
public static int codigo = 1;

//Métodos especiais
public void setSalario (double salario){
    this.salario = salario;
}
public double getSalario (){
    return salario;
}
public String getNome(){
    return nome;
}
public int getId(){
    return id;
}
//Construtor padrão:
public Funcionario(){
    this.id = Funcionario.codigo++;
}
//Construtor parametrizado:
public Funcionario(String nome){
    this.nome=nome;
    this.id = Funcionario.codigo++;
}

//Métodos comuns
public void bonifica(double aumento){
this.salario+=aumento;
}
public void demite(){
this.estaNaEmpresa = false;
}
public double calculaGanhoAnual(){
return salario*=12;
}

}
