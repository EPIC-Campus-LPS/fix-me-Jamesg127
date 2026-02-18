import java.util.*;

public class s_obj
{

    public String name;
    public int idNum;
    public ArrayList<Integer> list;

    public s_obj(String n, int id_num) {
        this.name = n;
        this.idNum = id_num;
        list= new ArrayList<Integer>();
    }

    public void add(int v) {
        list.add(v);
    }

    // This calculates average but returns -1 if empty
    public double getVal() {
        if(list.size()==0) return -1.0;
        double t = 0;
        for(int i = 0; i < list.size(); i++) {
            t += list.get(i);
        }
        return t / list.size();
    }
}