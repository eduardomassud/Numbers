import java.util.*;

class Crescente{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Number test = new Number();
        System.out.print("Este programa recebe seus numeros e os organizam em ordem crescente.\nQuantos numeros gostaria de testar?");
        int input = keyboard.nextInt();
        ArrayList<Integer> disordered = new ArrayList<Integer>(input);
        //input validation below
        if(input<=1){
            System.out.print("Tem que ter no minimo 2 numeros. Quantos numeros vc gostaria de testar? ");
            input = keyboard.nextInt();
        }
        for(int i = 0;i<input;i++){
            System.out.print("Digite um numero: ");
            int num = keyboard.nextInt();
            disordered.add(num);
        }
        
        // ArrayList<Integer> ordered = new ArrayList<Integer>(input);
        // for(int j = 0;j<input;j++){
        //     int smallest = disordered.get(0);
        //     for (int i : disordered){
        //         smallest = smallest < i ? smallest : i;
        //     }
        //     disordered.remove(disordered.indexOf(smallest));
        //     ordered.add(smallest);
        //     }
        System.out.println(test.organizarCrescente(disordered));
    }
}


