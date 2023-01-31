/**
 * @author Felix Reyes Jr.
 * @date 1/30/ 2023
 * A class for sign information
 */

package Signs;
import Signs.*;

import java.io.*;
import java.util.Scanner;
public class SignInfo {

    /**
     * Will return a zodiac sign according to the birth month and day given by the user
     * @return the sign of a given birth month and day
     * @throws IOException
     */
    public Sign getSign() throws IOException {
        Sign astro_sign = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Birth month: ");
        String month = sc.nextLine();
        System.out.print("Please enter the day number of your birthday: ");
        int day = sc.nextInt();
        month = month.toLowerCase();


        switch(month){
            case("december"): {
                if (day < 22) {
                    astro_sign = new Sagittarius();
                    return astro_sign;
                }
                else {
                    astro_sign = new Capricorn();
                    return astro_sign;
                }
            }

            case("january"):{
                if (day < 20) {
                    astro_sign = new Capricorn();
                    return astro_sign;
                }
                else {
                    astro_sign = new Aquarius();
                    return astro_sign;
                }
            }

            case("february"):{
                if (day < 19) {
                    astro_sign = new Aquarius();
                    return astro_sign;
                }
                else{
                    astro_sign = new Pisces();
                    return astro_sign;
                }
            }

            case("march"):{
                if (day < 21) {
                    astro_sign = new Pisces();
                    return astro_sign;
                }
                else {
                    astro_sign = new Aries();
                    return astro_sign;
                }
            }
            case("april"):{
                if (day < 20) {
                    astro_sign = new Aries();
                    return astro_sign;
                }
                else {
                    astro_sign = new Taurus();
                    return astro_sign;
                }
            }

            case("may"):{
                if (day < 21) {
                    astro_sign = new Taurus();
                    return astro_sign;
                }
                else {
                    astro_sign = new Gemini();
                    return astro_sign;
                }
            }

            case("june"):{
                if (day < 21) {
                    astro_sign = new Gemini();
                    return astro_sign;
                }
                else {
                    astro_sign = new Cancer();
                    return astro_sign;
                }
            }

            case("july"):{
                if (day < 23) {
                    astro_sign = new Cancer();
                    return astro_sign;
                }
                else {
                    astro_sign = new Leo();
                    return astro_sign;
                }
            }

            case("august"):{
                if (day < 23) {
                    astro_sign = new Leo();
                    return astro_sign;
                }
                else {
                    astro_sign = new Virgo();
                    return astro_sign;
                }
            }

            case("september"):{
                if (day < 23) {
                    astro_sign = new Virgo();
                    return astro_sign;
                }
                else {
                    astro_sign = new Libra();
                    return astro_sign;
                }
            }

            case("october"):{
                if (day < 23) {
                    astro_sign = new Libra();
                    return astro_sign;
                }
                else {
                    astro_sign = new Scorpio();
                    return astro_sign;
                }
            }

            case("november"):{
                if (day < 22) {
                    astro_sign = new Scorpio();
                    return astro_sign;
                }
                else {
                    astro_sign = new Sagittarius();
                    return astro_sign;
                }
            }
        }

        return astro_sign;
    }

    /**
     * Will print out all information from the specified sign class
     * @param sign
     */
    public void getSignInfo(Sign sign){
        System.out.println("\n The name of your sign is: " + sign.getName());
        System.out.println("\n The element type of your sign is: " + sign.getElement());
        System.out.println("\n The representation of your sign is: " + sign.getRep());
        System.out.println("\n the symbol of your sign is: " + sign.displaySymbol());
    }
}
