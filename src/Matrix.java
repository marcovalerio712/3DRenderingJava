import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private List<List<Double>> rows = new ArrayList<>();
    private List<List<Double>> columns = new ArrayList<>();

    private int rowsSize = 0;
    private int columnsSize = 0;

    public Matrix(int rowsSize, int columnsSize){
        this.rowsSize = rowsSize;
        this.columnsSize = columnsSize;

        for(int i = 0; i < rowsSize; i++){
            rows.add(new ArrayList<>());
            for(int j = 0; j < columnsSize; j++){
                rows.get(i).add(0d);
            }
        }

        for(int j = 0; j < columnsSize; j++){
            columns.add(new ArrayList<>());
            for(int i = 0; i < rowsSize; i++){
                columns.get(j).add(0d);
            }
        }
    }

    public void debug(){
        System.out.println("---Rows---");
        for(int i = 0; i < rowsSize; i++){
            for(int j = 0; j < columnsSize; j++)
                System.out.print(rows.get(i).get(j) + " | ");
            System.out.println();
        }
        System.out.println("---Columns---");
        for(int i = 0; i < columnsSize; i++){
            for(int j = 0; j < rowsSize; j++)
                System.out.print(columns.get(i).get(j) + " | ");
            System.out.println();
        }
    }


    public void addRow(int index, List<Double> row){

        if(index > rowsSize)
            index = rowsSize;

        rows.add(index, row);

        for(Double element : row){

        }

    }

}
