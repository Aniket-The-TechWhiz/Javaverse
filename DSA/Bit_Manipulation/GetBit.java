/*
Get the 3rd bit (position = 2) of a number n. (n = 0101)
Bit Mask: 1<<i
Operation: AND
*/

class GetBit{

  public static String getBit(int binaryValue,int pos){
    int bitMask=1<<pos;
    if((binaryValue & bitMask)!=0){
      return "Bit is one";
    } 
    else{
      return "Bit is zero";
      }
  }
  public static void main (String args[]){
  
    // Use 0b to tell Java this is binary
    int binaryValue=0b0101;
    int pos=2;
    System.out.println(getBit(binaryValue,pos));    
  }
}
