public class task2 {
    public static void main(String[] args) {
        int score=100000;
        int levelcompleted=8;
        int bonus=100;
        boolean gameover=true;
        int finalscore=calculatescore(score,levelcompleted,bonus,gameover);
        System.out.println("the final score is :"+finalscore);

        

        
    }
    public static int calculatescore(int score,int levelcompleted,int bonus,boolean gameover){
        if (gameover){
            int finalscore=score+(levelcompleted*bonus)+1000;
            return finalscore;
        }
        return -1;
    }
    
    
}
