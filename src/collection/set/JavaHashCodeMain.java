package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성

        final Object obj1 = new Object();
        final Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        final Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        final Member member1 = new Member("idA");
        final Member member2 = new Member("idA");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
