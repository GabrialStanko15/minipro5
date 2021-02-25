class Main {
  public static void main(String[] args) {
    countdown(10);
  }
    public static void countdown(int n) {

      if(n == 0) {
        System.out.println("Lift off! ");
      } else {
        System.out.println(n);
        n--;
        countdown(n);
      }
  
     
       
       
     

     
    
  }
}