class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int  squaresandwiches=0;
        int circularsandwiches=0;
        for(int choice:students){
            if(choice==0){
                circularsandwiches++;
            }
            else{
                squaresandwiches++;
            }
        }
        
        for(int sandwich:sandwiches){
            if(sandwich==0 && circularsandwiches==0) return squaresandwiches;
            if(sandwich==1 &&  squaresandwiches==0) return circularsandwiches;
            if(sandwich==0) circularsandwiches--;
            else squaresandwiches--;
        }
        return 0;
    }
}