public class stringbase
{
    public static void main(String [] args)
    {
        String s1= "java";
        String s2= "java";
        String s3= s1.concat(s2);
        System.out.println(s3.length());
       int out= s1.compareTo(s2);
       if(out >0)
           System.out.println("Yes");
       else
           System.out.println("No");

        String output = s1.substring(0, 1).toUpperCase() +s3.substring(1,s1.length())+" " + s2.substring(0,1).toUpperCase()+s2.substring(1,s2.length());
        System.out.println(output);
        //char ch [] =s3.toCharArray();
    }
}
