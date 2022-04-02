public class Circle {

    private Double radius;

    private char visualization[][];
    private int representationSize;

    //X^2 + Y^2 = R^2


    public Circle(Double radius){

        this.radius = radius;
        representationSize = (int) Math.round(radius);

        this.visualization = new char[representationSize][representationSize];

        for(int x = 0; x < representationSize; x++){

            for(int y = 0; y < representationSize; y++){

                if( (x*x) + (y*y) <= (radius * radius)  ){
                    visualization[x][y] = '*';
                }
                else
                    visualization[x][y] = '-';

            }

        }

    }


    public void render(){

        for(int x = 0; x < representationSize; x++){
            for(int y = 0; y < representationSize; y++){
                System.out.print(visualization[x][y]);
            }
            System.out.println();
        }

    }

}
