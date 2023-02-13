//We have to calculate the area of a rectangle, a square and a circle. 
//Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
//taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. T
//he parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side 
//and that of 'CircleArea' is its radius. 
//Now create another class 'Area' containing all 
//the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
//for printing the area of rectangle, square and circle respectively. 
//Create an object of class 'Area' and call all the three methods.

abstract class Shape {
    abstract void RectangleArea(double lenght, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);

    }

    class Area extends Shape{

        @Override
        void RectangleArea(double lenght, double breadth) {
            double Area = lenght*breadth;
            System.out.println("Rectangle area = " +Area);
            
        }

        @Override
        void SquareArea(double side) {
            double AreaSq =  side * side;
            System.out.println("Square area =" +AreaSq);
            
        }

        @Override
        void CircleArea(double radius) {
            double AreaCr = (radius * radius) * 3.14;
            System.out.println("Circle area = " +AreaCr);
            
        }

    }
    class calculate{
        public static void main(String args[]){
            Area A = new Area();
            A.RectangleArea(5, 10);
            A.SquareArea(15);
            A.CircleArea(5);
        }
    }