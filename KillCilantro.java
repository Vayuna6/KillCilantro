public class KillCilantro {

   public static String killCilantro(String parsley) {
   String answer= "";

   while (parsley.indexOf("cilantro") >= 0){
   int p = parsley.indexOf("cilantro");
   String firstPart = parsley.substring( 0, p);
   String SecondPart = parsley.substring(p+8, parsley.length());
   parsley = firstPart + "parsley" + SecondPart;
     

     }
      
    return parsley;
   }

public static void main(String [] args){
System.out.println(killCilantro("testcilantrotest"));
System.out.println(killCilantro("cilantrotest"));
System.out.println(killCilantro("nothinghere"));
System.out.println(killCilantro("testcilantro"));
System.out.println(killCilantro("cilantrocilantrocilantro"));

}
}