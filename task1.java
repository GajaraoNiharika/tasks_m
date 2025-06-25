public class task1 {
    public static void main(String[] args) {
        double a1=20.00d;
        double a2=80.00d;
        double val=(a1+a2)*100.00d;
        double remain=val%40.00d;
        System.out.println(remain);
        boolean vd=true;
        if ( remain!=0d){
            vd=false;
        }
       
        boolean isTrue =vd ? true :false;
        System.out.println(isTrue);

        
    }
    
}
