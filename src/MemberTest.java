public class MemberTest {
    public static void main(String[] args) {
        // 한명의 헬스클럽화원 데이터를 저장하고 출력하시오.
        Member m = new Member();

        m.name = "홍길동";
        m.age = 18;
        m.tel = "010-1111-1111";
        m.email = "fc@gmail.com";
        m.addr = "seoul";
        m.weight = 54.4f;

        System.out.println(m.name + "\t" + m.age + "\t" + m.tel + "\t" + m.email + "\t" + m.addr + "\t" + m.weight);


    }


}
