package drd.intern.project;

import javax.xml.soap.Text;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bucket {
    private int min;
    private int max;
    private ArrayList<Integer> NWIDS;
    private boolean split;
    public Bucket(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
    public void setNWIDS(ArrayList<Integer> NWIDS) {
        this.NWIDS = NWIDS;
    }
    public ArrayList<Integer> getNWIDS() {
        return NWIDS;
    }
    public void setSplit(boolean split) {
        this.split = split;
    }
    public boolean getSplit() {
        return split;
    }
}