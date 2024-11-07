import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * HW3_main
 *1) Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
  2) Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
  3) Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator.
  4) Модифицировать класс Контроллер, добавив в него созданный сервис.
  5) Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков,
     путем вызова созданного сервиса.
 */
public class HW3_main {

    public static void main(String[] args) {
// Создадим объект Поток10
        List<StudentGroup> Stream10 = new ArrayList<>();
        Stream10.add(new StudentGroup(1111));
        Stream10.add(new StudentGroup(2222));

// Создадим объект Поток11
        List<StudentGroup> Stream11 = new ArrayList<>();
        Stream11.add(new StudentGroup(3333));
        Stream11.add(new StudentGroup(4444));
        Stream11.add(new StudentGroup(5555));
        Stream11.add(new StudentGroup(6666));

// Создадим объект Поток12
        List<StudentGroup> Stream12 = new ArrayList<>();
        Stream12.add(new StudentGroup(7777));
        Stream12.add(new StudentGroup(8888));
        Stream12.add(new StudentGroup(9999));

// iterator
        StreamIterator StreamInfo = new StreamIterator(Stream10);
        Iterator<StudentGroup> Group = StreamInfo;
        while (Group.hasNext()) {
            System.out.println(StreamInfo.next()); //groupId: 1111
                                                   //groupId: 2222
        }

// iterable
        for (StudentGroup i : Stream10) { 
            System.out.println(i); //groupId: 1111
                                   //groupId: 2222
        }
// Comparator
        Stream s1 = new Stream(Stream10, 2);
        Stream s2 = new Stream(Stream11, 4);
        Stream s3 = new Stream(Stream12, 3);
        System.out.println(s1); // В потоке  [groupId: 1111, groupId: 2222] содержится 2 групп
        System.out.println(s2); // В потоке  [groupId: 3333, groupId: 4444, groupId: 5555, groupId: 6666] содержится 4 групп

        StreamComparator SC = new StreamComparator(s1, s2);
        SC.compare(s1, s2);
        System.out.println(SC); // результат -1
        SC.PrintCompareRes(SC.compare(s1, s2)); // s1 < s2

// Сортировка списка Потоков
        List<Stream> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        System.out.println(list1); //[groupId: 1111, groupId: 2222] содержится 2 групп,
                                   //[groupId: 3333, groupId: 4444, groupId: 5555, groupId: 6666] содержится 4 групп,
                                   //[groupId: 7777, groupId: 8888, groupId: 9999] содержится 3 групп]

        list1.sort(new StreamComparator(s1, s2));
        System.out.println(list1); // [groupId: 1111, groupId: 2222] содержится 2 групп,
                                   // [groupId: 7777, groupId: 8888, groupId: 9999] содержится 3 групп,
                                   // [groupId: 3333, groupId: 4444, groupId: 5555, groupId: 6666] содержится 4 групп]
        
    }
}