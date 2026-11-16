import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);

        // s1과 s2 두 객체를 비교자 new ~ 로 비교해 int 값 0 리턴

        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);

        // s1과 s3 두 객체를 비교자 new ~ 로 비교해 int 값 -1 리턴


        // • 0보다 작은 값 (음수, 예: -1)
        // 의미: A가 B보다 작다 (A < B)
        // 정렬 시: A가 B보다 앞에 옵니다 (오름차순 기준).

        // • 0
        // 의미: A와 B가 같다 (A == B)
        // 정렬 시: 두 값의 순서가 변경되지 않고 그대로 유지됩니다.

        // • 0보다 큰 값 (양수, 예: 1)
        // 의미: A가 B보다 크다 (A > B)
        // 정렬 시: A가 B보다 뒤에 옵니다 (오름차순 기준).


    }

    static class Student {
        
        int sno;

        Student(int sno){
            this.sno = sno;
        }
        
    }

    static class StudentComparator implements Comparator<Student>{

        @Override
        public int compare(Student a, Student b){

            return Integer.compare(a.sno, b.sno);

        }
    }
}
