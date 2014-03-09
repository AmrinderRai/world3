/**
 * Created by Amrinder on 09/03/2014.
 */

import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please input birth rate: ");
        double birth_input = s.nextDouble();

        System.out.println("Please input death rate: ");
        double death_input = s.nextDouble();

        System.out.println("Please input current population: ");
        double population_input = s.nextDouble();


        Population_feedbackLoop earthPopulation = new Population_feedbackLoop(birth_input, death_input, population_input);



        int Speed=0 ;
        for (int i =0; i < 5; i++){
        double currPopulation = earthPopulation.populationTicker().setDelay(50 * i);






    }
}
