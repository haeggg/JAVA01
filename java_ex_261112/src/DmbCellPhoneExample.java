public class DmbCellPhoneExample {
    public static void main(String[] args) {
        
        //dmbCellPhone 객체 완성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
        
        //Cellphone으로부터 상속받은 필드
        System.out.println("모델: "+ dmbCellPhone.model);
        System.out.println("색상: "+ dmbCellPhone.color);
        
        // dmbCellPhone의 필드
        System.out.println("채널: " + dmbCellPhone.channel);

        //CellPhone으로부터 상속 받은 메서드 호출
        System.out.println();
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요. 저는 홍길동입니다.");
        dmbCellPhone.sendVoice("넵, 반갑습니다.");
        dmbCellPhone.hangUp();

        // dmbCellPhone의 메서드 호출
        System.out.println();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannalDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}
