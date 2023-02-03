public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World123");

        Member member = new Member();
        member.setName("mr Kang");
        member.setAge(38);

        System.out.println(member.getName() + ' ' + member.getAge());
    }
}
