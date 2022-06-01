package json;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Cat implements Serializable {
    private final String name;
    private final int age;


    public void mau() {
        System.out.printf("Меня зовут %s, мне %d лет", name, age);
    }
}
