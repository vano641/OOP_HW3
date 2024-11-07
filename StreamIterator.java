import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    
    private int count;
    private final List<StudentGroup> Stream1;
    

    public StreamIterator(List<StudentGroup> stream10) {
        this.count = 0;
        this.Stream1 = stream10;
    }

    @Override
    public boolean hasNext() { 
        return count <= Stream1.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return Stream1.get(count++);
    }
}
