/*
 * Factory is a design pattern in common usage. Implement a ShapeFactory that can generate correct shape.

You can assume that we have only tree different shapes: Triangle, Square and Rectangle.

Example
ShapeFactory sf = new ShapeFactory();
Shape shape = sf.getShape("Square");
shape.draw();
>>  ----
>> |    |
>> |    |
>>  ----

shape = sf.getShape("Triangle");
shape.draw();
>>   /\
>>  /  \
>> /____\

shape = sf.getShape("Rectangle");
shape.draw();
>>  ----
>> |    |
>>  ----
 */
/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {

    void draw();

}

class Rectangle implements Shape {

}

class Square implements Shape {

}

class Triangle implements Shape {

}

public class ShapeFactory {

    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shape) {
        if (shape.equals("Rectangle")) {
            return new Rectangle();
        } else if (shape.equals("Square")) {
            return new Square();
        } else if (shape.equals("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }

}
