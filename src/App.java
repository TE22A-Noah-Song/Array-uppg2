import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int fält[]={1, 2, 3, 4};
        System.out.println(fält[0]+" "+ fält[1]+" "+fält[2]+" "+fält[3]);

        int temp1=fält[0];
        int temp2=fält[1];

        fält[0]=fält[3];
        fält[1]=fält[2];
        fält[2]=temp2;
        fält[3]=temp1;

        System.out.println(fält[0]+" "+ fält[1]+" "+fält[2]+" "+fält[3]);

        String fält2[]={"Hej","på","dig"};
        Scanner tangentbord=new Scanner(System.in);
        String gissning;
        String rätt_svar=fält2[1];
        
        System.out.print("Hej på ___. Gissa ordet: ");
    gissning = tangentbord.nextLine();

    System.out.println(gissning+"="+fält2[2]+":"+fält2[2].equals(gissning));

    // if (fält2[0].equals(gissning)) 
    // {
    //     System.out.println("Rätt");
    // }
    // else if( fält2[1].equals(gissning) )
    // {
    //     System.out.println("Fel");    
    // }
    // else if( fält2[2].equals(gissning) )
    // {

    


    }
}
