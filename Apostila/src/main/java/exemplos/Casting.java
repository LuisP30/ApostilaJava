package exemplos;
public class Casting {
    public static void main(String[]args){
    /*
    Às vezes, precisamos que um número decimal seja arredondado e armazenado num número inteiro. Para
    fazer isso sem que haja o erro de compilação, é preciso ordenar que o número quebrado seja moldado (cas-
    ted) como um número inteiro. Esse processo recebe o nome de casting.
    */
    double d3 = 3.14;
    int i = (int) d3;
    // O casting foi feito para moldar a variável d3 como um int.
    // O valor de i agora é 3
    }
}
