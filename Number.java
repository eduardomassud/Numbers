class Number {

    public boolean isPrime(int n) {
        int counter = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                counter++;
        }
        return counter==2;
    }

   public int[] organizarCrescente(int[] n){
        ArrayList<Integer> ordered = new ArrayList<Integer>(input);
        for(int j = 0;j<input;j++){
            int smallest = n.get(0);
            for (int i : n){
                smallest = smallest < i ? smallest : i;
            }
            n.remove(n.indexOf(smallest));
            ordered.add(smallest);
            }
        return ordered.toString();
    }
}