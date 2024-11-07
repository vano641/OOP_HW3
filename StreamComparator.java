import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    private Stream s1;
    private Stream s2;
    private int res;


    public StreamComparator(Stream s1, Stream s2) {
        this.s1 = s1;
        this.s2 = s2;
        this.res = compare(s1, s2);
    }

   
    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.NumberOfGroups1 > o2.NumberOfGroups1) {
            return 1;
        } else if (o1.NumberOfGroups1 < o2.NumberOfGroups1) {
            return -1;
        } else 
            return 0;
        }

        public void PrintCompareRes(int res){
            if (res == 1) {
                System.out.println("s1 > s2");
            } else if (res == -1) {
                System.out.println("s1 < s2");
            } else {
                System.out.println("s1 = s2");
            }
        }

        @Override
        public String toString() {
            return String.format("результат %d",res);
        }
}

