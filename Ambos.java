import java.util.*;

class Ambos{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Este programa recebe seus numeros e os organizam.\nQuantos numeros gostaria de testar?");
        int input = keyboard.nextInt();
        ArrayList<Integer> disordered1 = new ArrayList<Integer>(input);
        ArrayList<Integer> disordered2 = new ArrayList<Integer>(input);
        //input validation below
        if(input<=1){
            System.out.print("Tem que ter no minimo 2 numeros. Quantos numeros vc gostaria de testar? ");
            input = keyboard.nextInt();
        }
        for(int i = 0;i<input;i++){
            System.out.print("Digite um numero: ");
            int num = keyboard.nextInt();
            disordered1.add(num);
            disordered2.add(num);
        }
        ArrayList<Integer> crescente = new ArrayList<Integer>(input);
        ArrayList<Integer> descente = new ArrayList<Integer>(input);
        for(int j = 0;j<input;j++){
            int smallest = disordered1.get(0);
            for (int i : disordered1){
                smallest = smallest < i ? smallest : i;
            }
            disordered1.remove(disordered1.indexOf(smallest));
            crescente.add(smallest);
            }
        for(int j = 0;j<input;j++){
            int max = disordered2.get(0);
            for (int i : disordered2){
                max = max > i ? max : i;
            }
            disordered2.remove(disordered2.indexOf(max));
            descente.add(max);
            }
        System.out.println("Ordem crescente: "+crescente.toString());
        System.out.println("Ordem descente: "+descente.toString());
    }
}



