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
    }
}
