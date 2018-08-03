import java.util.*;

class Descente{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Este programa recebe seus numeros e os organizam em ordem descente.\nQuantos numeros gostaria de testar?");
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
        ArrayList<Integer> ordered = new ArrayList<Integer>(input);
        for(int j = 0;j<input;j++){
            int max = disordered.get(0);
            for (int i : disordered){
                max = max > i ? max : i;
            }
            disordered.remove(disordered.indexOf(max));
            ordered.add(max);
            }
        System.out.println(ordered.toString());
    }
}

/*for (int i =0;i<disordered.size();i++){
                if(smallest<disordered.get(i)){
                    smallest=disordered.get(i);
                }
            }*/
