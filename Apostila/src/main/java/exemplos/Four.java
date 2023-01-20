package exemplos;
public class Four {

    public static void main(String[] args) {
        //O código abaixo conta de 0 a 9
        for (int i = 0; i < 10; i = i + 1) { 
            System.out.println(i);
        //Repare que esse for poderia ser trocado por:
        //int i = 0; 
        //while (i < 10) { 
        //System.out.println("olá!"); 
        //i = i + 1; 
        }
    } 
}