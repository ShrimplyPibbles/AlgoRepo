package BurgerTime;

public class EricJBurgerTime {

    public static void main(String[] args) {
        int[] arrival = {3, 3, 9};
        int[] service = {2, 15, 14};

        System.out.println(maxWait(arrival, service));
    }

    public static int maxWait(int[] arrival, int[] service) {

        int maxWait = 0;
        int lastServed = 0;

        for (int i = 0; i < arrival.length; i++) {
            int newOrderTime = Math.max(lastServed, arrival[i]);
            lastServed = newOrderTime + service[i];
            int wait = newOrderTime - arrival[i];
            if (maxWait < wait)
                maxWait = wait;
        }

        return maxWait;
    }

}
