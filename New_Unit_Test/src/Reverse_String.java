
public class Reverse_String {
	String StrRev(String str) {
		 
        // str= "shaiyam";
        String  nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("shaiyam"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      
      }
     System.out.println(nstr);
     return nstr;
	}
}
      


