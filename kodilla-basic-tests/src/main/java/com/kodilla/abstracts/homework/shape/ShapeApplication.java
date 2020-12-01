package com.kodilla.abstracts.homework.shape;


public class ShapeApplication {
    public static void main(String[]args){
        Shape triangle = new Triangle(4.5,5.5,6.3);
        Shape trapeze = new Trapeze(5.7,4.6,7.6,8.4,7.6);
        Shape rectangle = new Rectangle(5.0,5.0);

        ShapeProcessor  processor = new ShapeProcessor();
        processor.process(triangle);
        processor.process(trapeze);
        processor.process(rectangle);


    }


}
