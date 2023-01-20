package exercicios;
import java.util.Scanner;
public class AmigoDono {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int idade;
    boolean amigoDoDono = false;
    
    System.out.println("Digite sua idade");
    idade = sc.nextInt();
    
if (idade < 18 && !amigoDoDono){
System.out.println("Não pode entrar");
}

else {
System.out.println("Pode entrar");
}

}
}
