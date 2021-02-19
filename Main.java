class Main {
  public static void main(String[] args) {
   liftOff(1);


    //ask if rocket is fueled and must reach certain requirment. if fuel is so an so than lift off. else abort mission. if strapped in launch else abort mission. if all are correcct then launch. 10 9 8 7 6 5 4 3 2 1 lift off!.mph if maxed out speed.
  }
    public static void liftOff(int n) {

      if(n == 0) {
        System.out.println("Lift off! ");
      } else {
        System.out.println("10 9 8 7 6 5 4 3 2 1 ");
        n--;
        liftOff(n);
      }
     
    }
  }
