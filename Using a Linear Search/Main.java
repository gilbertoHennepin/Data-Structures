import java.util.ArrayList;

public class CarSearch {
    ArrayList cars = new ArrayList();

    public CarSearch(){
        cars.add(new Car("Ford", "Mustang", "Blue", 38320.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Green", 28484.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Red", 31984.00, "DEALER TRADE"));
        cars.add(new Car("Ford", "Mustang", "Red", 41000.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Blue", 31044.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Green", 28484.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Blue", 30990.00,   "FACTORY ORDER"));
        cars.add(new Car("Toyota", "Corolla", "Green", 23450.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Red", 25500.00, "IN STOCK"));
        cars.add(new Car("Ford", "Escort", "Red", 38849.00, "FACTORY ORDER"));
        cars.add(new Car("Toyota", "Corolla", "Blue", 28959.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Green", 28462.00, "IN STOCK"));
        cars.add(new Car("Ford", "Mustang", "Blue", 70990.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Green", 32248.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Red", 33984.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Mustang", "Red", 55600.00, "DEALER TRADE"));
        cars.add(new Car("Toyota", "Camry", "Blue", 29755.00, "IN STOCK"));
        cars.add(new Car("Honda", "Accord", "Green", 29758.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Blue", 35838.00, "DEALER TRADE"));
        cars.add(new Car("Toyota", "Corolla", "Green", 25324.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Red", 28484.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Red", 33000.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Corolla", "Blue", 24428.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Civic", "Green", 28583.00, "FACTORY ORDER"));
    }

    public ArrayList searchAvailability(String availability) {

        // TODO 1: Create a results ArrayList to hold the search results
        ArrayList results = new ArrayList();

        /* TODO 2: Loop over the cars array, comparing the value of the
                   availability field to the method parameter. Save
                   matching cars to the results array list.
         */
        for (Object obj : cars) {
            Car car = (Car) obj;
            if (car.availability.equals(availability)) {
                results.add(car);
            }
        }
        /* TODO 3: if the results is empty, print a message saying
                   nothing was found */
        if(results.isEmpty()){
            System.out.println("There are no cars marked '" + availability + "' \n");
        }
        // TODO 4: Return results ArrayList.
        return results;
    }


    public ArrayList search(String make, String model, String color){

        // TODO 5: Create a results ArrayList to hold the search results
        ArrayList results = new ArrayList();

    /* TODO 6: Loop over the cars array, comparing the value of the
               make, model, and color fields to the method
               parameters. */
        for (Object obj : cars) {
            Car car = (Car) obj;
            if (car.color.equals(color) && car.model.equals(model) && car.make.equals(make)) {
            /* TODO 7: if the make, model, and color of the Car instance
                       match the method parameters, add it to the results
                       ArrayList. */
                results.add(car);
            }
        }
        if(results.isEmpty()){
            // TODO 8: If the results is empty. Print a message.
            System.out.println("There is no " + color + " " + make + " " + model + " available at this time. \n");
        }

        // TODO 9: Return the results ArrayList
        return results;
    }

    public ArrayList searchPrice(double priceLimit, boolean lowerThan){

        /* TODO 10: Create a results ArrayList to hold the search
            results */
        ArrayList results = new ArrayList();

        /* TODO 11: Loop over the cars array, comparing the price field
                    to the method parameters. */
        for (Object obj : cars) {
            Car car = (Car) obj;
            if (lowerThan && car.price < priceLimit) {
                /* TODO 12: If the lowerThan boolean is true, add all cars
                            whose price is less than the priceLimit to the
                            results */
                results.add(car);
            }else if(!lowerThan && car.price > priceLimit){
               /* TODO 13: If the lowerThan boolean is false, add all the
                            cars whose price is greater than the priceLimit
                            to the results */
                results.add(car);
            }
        }
        if(results.isEmpty()){
            // TODO 14: If the results is empty. Print a message.
            System.out.println("There are no cars priced " + (lowerThan ? "below" : "above") + " " + priceLimit + "\n");
        }

        // TODO 15: Return the results ArrayList
        return results;
    }


    public static void main(String [] args){


        CarSearch carSearch = new CarSearch();

        System.out.println("\nList cars IN STOCK");
        ArrayList carsFound = carSearch.searchAvailability("IN STOCK");
        for(Object obj : carsFound){
            Car car = (Car) obj;
            System.out.println(car);
        }

        System.out.println("\nList all Red, Ford Mustangs");
        carsFound = carSearch.search("Ford", "Mustang", "Red");
        for(Object obj : carsFound){
            Car car = (Car) obj;
            System.out.println(car);
        }

        System.out.println("\nList all cars under $25,000.00");
        carsFound = carSearch.searchPrice(25000.00, true);
        for(Object obj : carsFound){
            Car car = (Car) obj;
            System.out.println(car);
        }

        System.out.println();
    }
}
