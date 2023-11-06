package Classes;
public class Calculadora {

    //Funções (Soma, Subtração, Multiplicação e Divisão)

    /*Realiza operação de adição
      @param num1 = O primeiro operando
      @param num2 = O Segundo operando
      @return = O resultado da adição
    */
    public float soma(int num1, int num2){
        return num1+num2;
    }

    /*Realiza operação de subtração
      @param num1 = O primeiro operando
      @param num2 = O Segundo operando
      @return = O resultado da subtração
    */  
    public float subtracao(int num1, int num2){
        return num1-num2;
    }

    /*Realiza operação de multiplicação
      @param num1 = O primeiro operando
      @param num2 = O Segundo operando
      @return = O resultado da multiplicação
    */  
    public float multiplicacao(int num1, int num2){
        return num1*num2;
    }

    /*Realiza operação de divisão
      @param num1 = O primeiro operando
      @param num2 = O Segundo operando
      @return = O resultado da divisão
    */  
    public float divisao(int num1, int num2){
        return num1/num2;
    }
}

