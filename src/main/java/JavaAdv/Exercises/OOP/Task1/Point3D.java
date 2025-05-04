package JavaAdv.Exercises.OOP.Task1;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z){
        this.z = z;
        super.setXY(x, y);
    }

    public Point3D(){
        super();
        this.z = 0;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), z};
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", super.getX(), super.getY(), z);
    }
}
