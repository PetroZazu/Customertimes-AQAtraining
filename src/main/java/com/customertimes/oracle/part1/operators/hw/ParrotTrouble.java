package com.customertimes.oracle.part1.operators.hw;

/*
We have a loud talking parrot.
The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking
and
the hour is before 7 or after 20.
Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */
public class ParrotTrouble {
    public static boolean perrotTroubleRazDva(boolean talking, int hour) {
        if (talking && ((hour > 20) || (hour < 7))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean tf = perrotTroubleRazDva(false, 4);
        System.out.println(tf);
    }
}
