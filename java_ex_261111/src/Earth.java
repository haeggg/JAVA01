public class Earth {
    
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    // 상수 = 정적 final 필드
    // - 객체마다 가지고 있지 않음
    // - 메소드 영역에 클래스 별로 관리되는 불변의 정적 필드

    // 상수 이름은 전부 대문자로 작성 / 다른 단어가 연결될 때는 _로 연결

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
