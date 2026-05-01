class SetBit{
  public static void main(String args[]){
    int binaryValue=5;
    int pos=2;
    int bitMask=1<<pos;
    System.out.println("change value :"+(binaryValue|bitMask));
  }
}
