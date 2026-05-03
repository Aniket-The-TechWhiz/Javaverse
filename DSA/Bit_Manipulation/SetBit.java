/*
Set the 2nd bit (position = 1) of a number n. (n = 0101)
Bit Mask: 1<<i
Operation: OR
*/

class SetBit{
  public static void main(String args[]){
    int binaryValue=5;
    int pos=2;
    int bitMask=1<<pos;
    System.out.println("change value :"+(binaryValue|bitMask));
  }
}
