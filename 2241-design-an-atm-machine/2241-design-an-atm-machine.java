class ATM {
    int[] notes;
    public ATM() {
        this.notes = new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i =0; i<5; i++){
            notes[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] ans = new int[5];
        for(int i =4; i>=0; i--){
            int denom =0;
            if(i==4) denom = 500;
            else if(i==3) denom = 200;
            else if(i==2) denom = 100;
            else if(i==1) denom = 50;
            else denom = 20;
            ans[i] = Math.min(notes[i],amount/denom);
            amount-=ans[i]*denom;
        }
        if(amount==0){
            for(int i=0; i<5; i++) notes[i]-=ans[i];
            return ans;
        } 
        return new int[] {-1};
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */