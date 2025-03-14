package Assign_2.Part2.Q5;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private int quantity;

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }else if(this.getClass() != obj.getClass()) {
//            return false;
//        }
//        Book b = (Book)obj;
//        return Objects.equals(this.name, b.getName()) && this.id == b.getId() && this.quantity == b.getQuantity();
//    }
}
