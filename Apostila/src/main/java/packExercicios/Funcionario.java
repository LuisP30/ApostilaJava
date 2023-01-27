package packExercicios;
public class Funcionario {
public String nome;
public String departamento;
public double salario;
public String dataEntrada;
String rg;
boolean estaNaEmpresa;

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
