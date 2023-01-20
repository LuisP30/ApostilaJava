package exemplos;
public class If {

    public static void main(String[] args) {
    int idade = 18; 
    boolean amigoDoDono = true; 
     
   if (idade < 17 && amigoDoDono == false) { 
        // Esse código também pode ser:
        // if (idade < 17 && !amigoDoDono)
        System.out.println("Não pode entrar"); 
    } 
    else { System.out.println("Pode entrar"); }

    }
    /*
    Você pode concatenar expressões booleanas através dos 
    operadores lógicos"E” e "OU”. O "E” é representado
    pelo && e o "OU” é representado pelo ||.
    */
}
