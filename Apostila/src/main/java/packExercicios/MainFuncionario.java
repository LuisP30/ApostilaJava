
package packExercicios;
public class MainFuncionario {
    public static void main(String[]args){
    Funcionario f1 = new Funcionario();
    f1.nome = "Hugo";
    f1.salario = 100;
    f1.bonifica(50);
    System.out.println("Salário atual: "+f1.salario);
    System.out.println("Ganho anual:"+f1.calculaGanhoAnual());
    }
}
