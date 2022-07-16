package gambler_assign;

public class GamblerSimulator {

    public static void main(String args[]) {

            int stake=100;
            int bet=1;
            while(stake>=0) {

                System.out.println(stake);
                stake=stake-bet;
            }

        }


}
