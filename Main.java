import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double converted;
        double converter;
        int response;
        int action;

        System.out.println("Welcome to Conversion Central! ");
        do {
            System.out.print("\n1) Distance\n2) Temperature\n3) Currency\n4) Weight\n5) Quit\nWhat type of conversion would you like to do: ");
            action = scanner.nextInt();
            while (action < 1 || action > 5) {
                System.out.print("Please enter a number between 1 and 5: ");
                action = scanner.nextInt();
            }
            switch (action) {
                case 1 -> {
                    DistanceConverter distanceConverter = new DistanceConverter();
                    System.out.print("\n1) Miles to KM\n2) KM to Miles\nWhat type of conversion would you like to do: ");
                    response = scanner.nextInt();
                    while (response < 1 || response > 2) {
                        System.out.print("Please enter 1 or 2: ");
                        response = scanner.nextInt();
                    }
                    System.out.print("\nEnter a distance: ");
                    converter = scanner.nextInt();
                    while (converter < 0) {
                        System.out.println("Please enter a valid distance: ");
                        converter = scanner.nextDouble();
                    }
                    distanceConverter.setDistance(converter);
                    switch (response) {
                        case 1 -> {
                            distanceConverter.milesToKM(converter);
                            converted = distanceConverter.getDistance();
                            System.out.println("\n"+converter + " miles is " + decimalFormat.format(converted) + " km.");
                        }
                        case 2 -> {
                            distanceConverter.kmToMiles(converter);
                            converted = distanceConverter.getDistance();
                            System.out.println("\n"+converter + " km is " + decimalFormat.format(converted) + " miles.");
                        }
                    }
                }
                case 2 -> {
                    TemperatureConverter temperatureConverter = new TemperatureConverter();
                    System.out.print("\n1) Fahrenheit to Celsius\n2) Celsius to Fahrenheit\n3) Fahrenheit to Kelvin\n4) Kelvin to Fahrenheit\n5) Celsius to Kelvin\n6) Kelvin to Celsius\nWhat type of conversion would you like to do: ");
                    response = scanner.nextInt();
                    while (response < 1 || response > 6) {
                        System.out.print("Please enter a valid choice between 1 and 6: ");
                        response = scanner.nextInt();
                    }
                    System.out.print("\nEnter a temperature: ");
                    converter = scanner.nextDouble();
                    temperatureConverter.setTemp(converter);
                    switch (response) {
                        case 1 -> {
                            temperatureConverter.fahrenheitToC(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°F is "+decimalFormat.format(converted)+"°C");
                        }
                        case 2 -> {
                            temperatureConverter.celsiusToF(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°F is "+decimalFormat.format(converted)+"°C");
                        }
                        case 3 -> {
                            temperatureConverter.fahrenheitToK(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°F is "+decimalFormat.format(converted)+"°K");
                        }
                        case 4 -> {
                            temperatureConverter.kelvinToF(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°K is "+decimalFormat.format(converted)+"°F");
                        }
                        case 5 -> {
                            temperatureConverter.celsiusToK(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°C is "+decimalFormat.format(converted)+"°F");
                        }
                        case 6 -> {
                            temperatureConverter.kelvinToC(converter);
                            converted = temperatureConverter.getTemp();
                            System.out.println("\n"+converter +"°K is "+decimalFormat.format(converted)+"°C");
                        }
                    }
                }
                case 3 -> {
                    CurrencyConverter currencyConverter = new CurrencyConverter();
                    System.out.print("\n1) USD to EUR\n2) EUR to USD\n3) USD to YEN\n4) YEN to USD\n5) EUR to YEN\n6) YEN to EUR\nWhat type of conversion would you like to do: ");
                    response = scanner.nextInt();
                    while (response < 1 || response > 6) {
                        System.out.print("Please enter a valid choice between 1 and 6: ");
                        response = scanner.nextInt();
                    }
                    System.out.print("\nEnter an amount: ");
                    converter = scanner.nextDouble();
                    while (converter < 0) {
                        System.out.println("Please enter a valid amount: ");
                        converter = scanner.nextDouble();
                    }
                    currencyConverter.setAmount(converter);
                    switch (response) {
                        case 1 -> {
                            currencyConverter.usdToEUR(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" USD is "+decimalFormat.format(converted)+" EUR");
                        }
                        case 2 -> {
                            currencyConverter.eurToUSD(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" EUR is "+decimalFormat.format(converted)+" YEN");
                        }
                        case 3 -> {
                            currencyConverter.usdToYEN(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" USD is "+decimalFormat.format(converted)+" YEN");
                        }
                        case 4 -> {
                            currencyConverter.yenToUSD(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" YEN is "+decimalFormat.format(converted)+" USD");
                        }
                        case 5 -> {
                            currencyConverter.eurToYEN(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" EUR is "+decimalFormat.format(converted)+" YEN");
                        }
                        case 6 -> {
                            currencyConverter.yenToEUR(converter);
                            converted = currencyConverter.getAmount();
                            System.out.println(converter+" YEN is "+decimalFormat.format(converted)+" EUR");
                        }
                    }
                }
                case 4 -> {
                    WeightConverter weightConverter = new WeightConverter();
                    System.out.print("\n1) Pounds to Kilograms 2) Kilograms to Pounds\nWhat type of conversion would you like to make: ");
                    response = scanner.nextInt();
                    while (response < 1 || response > 2) {
                        System.out.print("Please enter 1 or 2: ");
                        response = scanner.nextInt();
                    }
                    System.out.print("\nEnter a weight: ");
                    converter = scanner.nextDouble();
                    while (converter < 0) {
                        System.out.println("Please enter a valid weight: ");
                        converter = scanner.nextDouble();
                    }
                    weightConverter.setWeight(converter);
                    switch (response) {
                        case 1 -> {
                            weightConverter.lbsToKG(converter);
                            converted = weightConverter.getWeight();
                            System.out.println(converter +"lbs is "+decimalFormat.format(converted)+" kilograms");
                        }
                        case 2 -> {
                            weightConverter.kgToLbs(converter);
                            converted = weightConverter.getWeight();
                            System.out.println(converter +"kgs is "+decimalFormat.format(converted)+" lbs");
                        }
                    }
                }
            }
        }
        while (action != 5);
        System.out.println("Thanks for joining me.");
    }
}
