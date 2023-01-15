public class prime {
    public static void main(String[] args) {
        //1-100 arasındaki asal sayıları bulma.

        boolean isPrime = true;

        for (int i=2; i <= 100; i++){
            isPrime = true;
            for( int div =2; div < i; div++){
                if (i % div == 0){
                    isPrime=false;
                    break;
                }
            }
          if (isPrime){
                System.out.println(i+ " ");
            }
        }


        }
    }

