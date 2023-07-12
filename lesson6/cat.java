package lesson6;

import java.util.Objects;

public class cat {
String Brand;
    String Model;
    int Memory;
    String Camera;

    public cat() {
     }
    public cat(String Brand, String Model, int Memory, String Camera){
        this.Brand = Brand;
        this.Model = Model;
        this.Memory = Memory;
        this.Camera = Camera;
    }
 @Override
    public String toString() {
        return String.format("%s: %s, %d years, %s \n", Brand, Model, Memory, Camera);
    }
 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return Memory == cat.Memory && Objects.equals(Brand, cat.Brand) && Objects.equals(Model, cat.Model) && Objects.equals(Camera, cat.Camera);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Brand, Model, Memory, Camera);
    }
}