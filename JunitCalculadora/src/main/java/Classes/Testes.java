package Classes;
public class Testes {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        float result;

        result = calculo.soma(0, -1);
        System.out.println("Zero + Menos: "+ result);
        
        result = calculo.soma(0, 0);
        System.out.println("Zero + Zero: "+ result);

        result = calculo.soma(1, 1);
        System.out.println("Mais + Mais: "+ result);
        
        result = calculo.soma(1, -1);
        System.out.println("Mais + Menos: "+ result);
        
        result = calculo.soma(1, 0);
        System.out.println("Mais + Zero: "+ result);
        
        result = calculo.soma(-1, 1);
        System.out.println("Menos + Mais: "+ result);
        
        result = calculo.soma(-1, -1);
        System.out.println("Menos + Menos: "+ result);
        
        result = calculo.soma(-1, 0);
        System.out.println("Menos + Zero: "+ result);
        
        result = calculo.soma(0, 1);
        System.out.println("Zero + Mais: "+ result);

        

        result = calculo.subtracao(0, -5);
        System.out.println("Zero - Menos: "+ result);
        
        result = calculo.subtracao(0, 0);
        System.out.println("Zero - Zero: "+ result);

        result = calculo.subtracao(1, 1);
        System.out.println("Mais - Mais: "+ result);
        
        result = calculo.subtracao(1, -1);
        System.out.println("Mais - Menos: "+ result);
        
        result = calculo.subtracao(1, 0);
        System.out.println("Mais - Zero: "+ result);
        
        result = calculo.subtracao(-1, 1);
        System.out.println("Menos - Mais: "+ result);
        
        result = calculo.subtracao(-1, -1);
        System.out.println("Menos - Menos: "+ result);
        
        result = calculo.subtracao(-1, 0);
        System.out.println("Menos - Zero: "+ result);
        
        result = calculo.subtracao(0, 1);
        System.out.println("Zero - Mais: "+ result);
        
    

        result = calculo.multiplicacao(0, -1);
        System.out.println("Zero x Menos: "+ result);
        
        result = calculo.multiplicacao(0, 0);
        System.out.println("Zero x Zero: "+ result);

        result = calculo.multiplicacao(1, 1);
        System.out.println("Mais x Mais: "+ result);
        
        result = calculo.multiplicacao(1, -1);
        System.out.println("Mais x Menos: "+ result);
        
        result = calculo.multiplicacao(1, 0);
        System.out.println("Mais x Zero: "+ result);
        
        result = calculo.multiplicacao(-1, 1);
        System.out.println("Menos x Mais: "+ result);
        
        result = calculo.multiplicacao(-1, -1);
        System.out.println("Menos x Menos: "+ result);
        
        result = calculo.multiplicacao(-1, 0);
        System.out.println("Menos x Zero: "+ result);
        
        result = calculo.multiplicacao(0, 1);
        System.out.println("Zero x Mais: "+ result);
        


        result = calculo.divisao(0, 1);
        System.out.println("Zero + Mais: "+ result);
        
        result = calculo.divisao(0, -1);
        System.out.println("Zero + Menos: "+ result);

        result = calculo.divisao(1, 1);
        System.out.println("Mais + Mais: "+ result);
        
        result = calculo.divisao(1, -1);
        System.out.println("Mais + Menos: "+ result);
        
        result = calculo.divisao(-1, 1);
        System.out.println("Menos + Mais: "+ result);
        
        result = calculo.divisao(-1, -1);
        System.out.println("Menos + Menos: "+ result);      
        
    }
}
