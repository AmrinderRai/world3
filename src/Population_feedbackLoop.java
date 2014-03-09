/**
 * Created by Amrinder on 09/03/2014.
 */
public class Population_feedbackLoop {
    private double populationTotal;
    private double birthRate;
    private double deathRate;

    public Population_feedbackLoop(double birth_rate, double death_rate,double totalPopulation) {

        birthRate = birth_rate;
        deathRate = death_rate;
        populationTotal = totalPopulation;
    }

    public int populationTicker() {

        while(true) {

          populationTotal += populationTotal*((birthRate - deathRate) /100 );
            System.out.println(populationTotal);
            continue;

        }

    }







}
