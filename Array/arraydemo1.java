public class arraydemo1{
    public static void main(String[]args){
        int ages[]={18,17,16,21,24};
       System.out.println(ages[3]);
       System.out.println(ages[ages.length-1]);

       for(int i=0;i<=ages.length-1;i++){
        System.out.println(ages[i]);
       }
    }
}