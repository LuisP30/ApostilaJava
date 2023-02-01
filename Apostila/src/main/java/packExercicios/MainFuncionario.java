
package packExercicios;
public class MainFuncionario {
    public static void main(String[]args){
    Funcionario f1 = new Funcionario("Hugo");
    f1.setSalario(100);
    f1.bonifica(50);
    Funcionario f2 = new Funcionario("Jonas");
    f2.setSalario(250);
    f2.bonifica(30);
    Funcionario f3 = new Funcionario("Mateus");
    f3.setSalario(60);
    f3.bonifica(60);
    
    
    //Informações de Funcionário f1:
    System.out.println("Nome: "+f1.getNome()+"\nSalário atual: "+f1.getSalario()+"\nGanho anual: "+f1.calculaGanhoAnual()+"\nID: "+f1.getId());
    //Informações de Funcionário f2:
    System.out.println("\nNome: "+f2.getNome()+"\nSalário atual: "+f2.getSalario()+"\nGanho anual: "+f2.calculaGanhoAnual()+"\nID: "+f2.getId());
    //Informações de Funcionário f3:
    System.out.println("\nNome: "+f3.getNome()+"\nSalário atual: "+f3.getSalario()+"\nGanho anual: "+f3.calculaGanhoAnual()+"\nID: "+f3.getId());
    }
    
    /*É necessária a utilização do construtor padrão pois sem ele ficaria apenas o construtor
    parametrizado tornando-se assim obrigatório declarar os argumentos passados para 
    ele na criação da classe Funcionário*/
    
    /*Sempre que criado um novo objeto, ele recebe um id único, sendo necessário apenas
    o método Getter para retornar o valor do id do objeto. A utilização de um Setter não
    se faz necessária visto que o valor do id já está sendo incrementado de forma automatica.*/
}
