import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        
        Set <String> set = new HashSet<String>();

        // set add

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");
        set.add("iBATIS");

        // 값 = 키 > 중복되면 값 들어가지 않음

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        // 객체 검색 Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        // set remove

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체 수: " + size);

        for(String element : set){
            System.out.println("\t" + element);
        }

        // set clear

        set.clear();
        if(set.isEmpty()){
            System.out.println("비어 있음");
        }
    }
}
