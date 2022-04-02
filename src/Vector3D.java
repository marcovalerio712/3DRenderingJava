public class Vector3D {

    private double x, y, z;
    private double magnitude;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        calculateMagnitude();
    }

    public double getX(){ return x; }
    public double getY(){ return y; }
    public double getZ(){ return z; }
    public double getMagnitude(){ return magnitude; }

    public void setX(double x){
        this.x = x;
        calculateMagnitude();
    }
    public void setY(double y){
        this.y = y;
        calculateMagnitude();
    }
    public void setZ(double z){
        this.z = z;
        calculateMagnitude();
    }

    public static Vector3D sum(Vector3D first, Vector3D second){

        double resultX = first.getX() + second.getX();
        double resultY = first.getY() + second.getY();
        double resultZ = first.getZ() + second.getZ();

        return new Vector3D(resultX, resultY, resultZ);

    }

    public Vector3D normalized(){

        double normalizedX = x / magnitude;
        double normalizedY = y / magnitude;
        double normalizedZ = z / magnitude;

        return new Vector3D(normalizedX, normalizedY, normalizedZ);

    }

    public void multiplyBy(double value){
        x *= value;
        y *= value;
        z *= value;
    }

    public Vector3D multipliedBy(double value){
        return new Vector3D(x * value, y* value, z * value);
    }

    public Vector3D getInverse(){
        return multipliedBy(-1);
    }

    private void calculateMagnitude(){
        this.magnitude = Math.sqrt(x*x + y*y + z*z);
    }

    @Override
    public String toString(){
        return "[" + x + ", " + y + ", " + z + "]";
    }

}
