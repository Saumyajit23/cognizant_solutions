package com.forecasting;

public class FinancialForecast {

    // Recursive method to forecast future value
    public static double forecastFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double currentValue = 10000; 
        double growthRate = 0.05;    
        int years = 23;               

        double futureValue = forecastFutureValue(currentValue, growthRate, years);

        System.out.printf("Forecasted value after %d years: %.2f", years, futureValue);
    }
}
