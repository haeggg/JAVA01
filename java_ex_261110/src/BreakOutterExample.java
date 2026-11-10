public class BreakOutterExample {
    
    public static void main(String[] args) throws Exception{
        
        Outter: for(char upper='A'; upper <= 'Z'; upper++){

                    for(char lower = 'a'; lower <= 'z'; lower++){

                        System.out.println(upper + "-" + lower);
                        if (lower == 'g') {
                            break Outter;
                            // lower가 g일 때 outter for문 종료
                        }
                    }
                }
        
        System.out.println("프로그램 종료");
    }
}
