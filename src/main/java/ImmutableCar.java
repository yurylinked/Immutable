import java.util.Date;

public final class ImmutableCar {
    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int[] getNumberOfCars() {
        return numberOfCars.clone();
    }

    public Object[] getObjects() {
        return getObjectsClone(objects);
    }

    private Object[] getObjectsClone(Object[] objects) {
        Object[] objectsClone = new Object[objects.length];

        for (int i = 0; i < objects.length; i++) {
            objectsClone[i] = objects[i];
        }

        return objectsClone;
    }

    public Date getDateOfProduction() {
        return (Date) dateOfProduction.clone();
    }

    private final int number;
    private final String brand;
    private final int[] numberOfCars;
    private final Object[] objects;
    private final Date dateOfProduction;

    public ImmutableCar(int number, String brand, int[] numberOfCars, Object[] objects, Date dateOfProduction) {
        this.number = number;
        this.brand = brand;
        this.numberOfCars = numberOfCars;
        this.objects = objects;
        this.dateOfProduction = dateOfProduction;
    }
}