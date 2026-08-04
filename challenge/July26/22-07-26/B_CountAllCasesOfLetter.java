class B_CountAllCasesOfLetter{
  public static int [] countUpperLowerCaseDigitsSepcialChar(String str){
    if(str==null){return new int[]{0,0,0,0};}
    int upperCase=0;
    int lowerCase=0;
    int digits=0;
    int specialChar=0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        
        if (ch >= 'a' && ch <= 'z') {
            lowerCase++;
        } else if (ch >= 'A' && ch <= 'Z') {
            upperCase++;
        } else if (ch >= '0' && ch <= '9') {
            digits++;
        } else if (ch == ' '){
          //nothing
        }else {
            specialChar++;
        }
    }
    return new int[]{upperCase, lowerCase, digits, specialChar};
  } 
  public static void main(String args[]){
    String str="Hello World! 2026 #Java";
    int i[]=countUpperLowerCaseDigitsSepcialChar(str);
    System.out.println("Count of all cases of str : "+str);
    System.out.println("Upper case : "+i[0]);
    System.out.println("Lower case : "+i[1]);
    System.out.println("Digits : "+i[2]);
    System.out.println("Special Char : "+i[3]);
  }
}
