package ChildProductAndStorageExample;

public class StorageImpl <T> implements Storage<T> {

    // 수정
    private T[] items;

    public StorageImpl(int capacity) {
        items = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index) {
        items[index] = item;
    }

    @Override
    public T get(int index) {
        return items[index];
    }
    
    // 기존 코드
    
    public class Course<T>{

        private String name;
        private T[] students;

        public Course(String name, int capacity) {
            this.name = name;
            students = (T[]) (new Object[capacity]);
        }

        public void add(T t) {
            for(int i = 0; i < students.length; i++) {
                if(students[i] == null) {
                    students[i] = t;
                    break;
                }
            }
        }

    }    
    
}




