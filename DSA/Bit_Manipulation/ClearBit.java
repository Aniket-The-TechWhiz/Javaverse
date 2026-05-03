/*
clear the 3rd bit (position = 2) of a number n. (n = 0101)
Bit Mask: 1<<i
Operation: AND with NOT

first do bitmask and perform not on bitmask then perform the and operation 
*/

class ClearBit{
  public static void main(String args[]){
    int binaryValue=5;
    int pos=2;
    int bitMask=1<<pos;
    bitMask=~bitMask;
    System.out.println("clear bit and now ans is : "+(binaryValue&bitMask));
  }
}
