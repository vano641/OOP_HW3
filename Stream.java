import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    
    private List<StudentGroup> Stream1;
    public Integer NumberOfGroups1;



    public Stream(List<StudentGroup> Stream1, Integer NumberOfGroups1) {
        this.Stream1 = Stream1;
        this.NumberOfGroups1 = NumberOfGroups1;
    }

    public List<StudentGroup> getStream1() {
        return this.Stream1;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator((List<StudentGroup>) this);
    }

    public void setStream1(List<StudentGroup> Stream1) {
        this.Stream1 = Stream1;
    }

    public Integer getNumberOfGroups1() {
        return this.NumberOfGroups1;
    }

    public void setNumberOfGroups1(Integer NumberOfGroups1) {
        this.NumberOfGroups1 = NumberOfGroups1;
    }

    @Override
    public String toString() {
        
        return String.format("\n%s содержится %d групп", Stream1, NumberOfGroups1);
    }
}
