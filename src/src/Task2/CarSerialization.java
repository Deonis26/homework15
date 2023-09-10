package Task2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class CarSerialization {
    public static void main(String[] args) {
        Car car = createCar();
        String file= "textFolder/serialize.txt";
        serialize(car, file);
        Car car1=deserialize(file);
        System.out.println(car);
    }
    static Car createCar(){
        Car car = new Car("жигуль", "1221r1", 150, "зеленый");
        return car;
    }
    static void serialize(Car car, String file){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(car);
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    static Car deserialize(String file){
        Car car = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            car= (Car) objectInputStream.readObject();
        } catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return car;
    }
}
