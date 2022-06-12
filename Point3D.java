package BaiTap6;

public class Point3D extends Point2D {
    float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float array[] = new float[3];
        array[0] = this.x;
        array[1] = this.y;
        array[2] = this.z;
        return new float[] {
                this.x, this.y, this.z
        };
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
