class ClearBit{
  public static void main(String args[]){
    int binaryValue=5;
    int pos=2;
    int bitMask=1<<pos;
    bitMask=~bitMask;
    System.out.println("clear bit and now ans is : "+(binaryValue&bitMask));
  }
}
