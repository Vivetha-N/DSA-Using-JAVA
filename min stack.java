class MinStack {
    private ArrayList<Integer> realstack;
    private ArrayList<Integer> minstack;
    private int realtop;
    private int mintop;
    public MinStack() {
       realstack= new ArrayList<>();
       minstack=new ArrayList<>();
       realtop=-1;
       mintop=-1; 
    }
    
    public void push(int val) {
        realtop++;
        realstack.add(val);
        if(minstack.isEmpty() || val <= minstack.get(mintop)){
            mintop++;
            minstack.add(val);
        }
    }
    
    public void pop() {
        int remove=realstack.remove(realtop);
        realtop--;
        if(mintop!=-1 && minstack.get(mintop)==remove){
            minstack.remove(mintop);
            mintop--;
        }
    }
    
    public int top() {
        return realstack.get(realtop);
    }
    
    public int getMin() {
        return minstack.get(mintop);
    }
}