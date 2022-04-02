import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private List<List<Double>> rows = new ArrayList<>();
    private List<List<Double>> columns = new ArrayList<>();

    private int rowsSize;
    private int columnsSize;

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
                //Test
            }
        }
    }

    public int rows(){
        return this.rowsSize;
    }

    public int columns(){
        return this.columnsSize;
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

    public void setRow(int index, List<Double> row){

        rows.set(index, new ArrayList<>(row));

        for(int i = 0; i < columnsSize; i++){
            columns.get(i).set(index, row.get(i));
        }

    }

    public List<Double> getRow(int index){
        return rows.get(index);
    }

    public void setColumn(int index, List<Double> column){
        columns.set(index, new ArrayList<>(column));

        for(int i = 0; i < rowsSize; i++){
            rows.get(i).set(index, column.get(i));
        }
    }

    public List<Double> getColumn(int index){
        return columns.get(index);
    }

    public static Matrix multiply(Matrix A, Matrix B){

        if(A.columns() != B.rows())
            return null;

        Matrix result = new Matrix(A.rows(), B.columns());
        for(int i = 0; i < result.columns(); i++){
            List<Double> newRow = new ArrayList<>();
            for(int j = 0; j < result.rows(); j++){
                newRow.add(dotProduct(A.getRow(i), B.getColumn(j)));
            }
            result.setRow(i, newRow);
        }

        return result;
    }

    private static Double dotProduct(List<Double> firstVector, List<Double> secondVector){

        if(firstVector.size() != secondVector.size())
            return null;
        double result = 0d;
        int size = firstVector.size();
        for(int i = 0; i < size; i++){
            result += firstVector.get(i) * secondVector.get(i);
        }

        return result;

    }

}
