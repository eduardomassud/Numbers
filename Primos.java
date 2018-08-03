import java.util.*;

class Primos{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Number test = new Number();
        System.out.print("Este programa recebe seus numeros e retorna somente os numeros primos.\nQuantos numeros gostaria de testar?");
        int input = keyboard.nextInt();
        ArrayList<Integer> original = new ArrayList<Integer>(input);
        //input validation below
        if(input<0){
            System.out.print("Tem que ter no minimo 1 numero. Quantos numeros vc gostaria de testar? ");
            input = keyboard.nextInt();
        }
        for(int i = 0;i<input;i++){
            System.out.print("Digite um numero: ");
            int num = keyboard.nextInt();
            original.add(num);
        }
        ArrayList<Integer> primos = new ArrayList<Integer>(input);
        for(int j = 0;j<original.size();j++){
            if(test.isPrime(original.get(j))){
                primos.add(original.get(j));  
            }
        }
        //System.out.println(original.toString()); 
        System.out.println("Primo(s): "+primos.toString());   
    }
}