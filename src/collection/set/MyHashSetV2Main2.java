package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        final Member hi = new Member("hi");
        final Member jpa = new Member("JPA");
        final Member java = new Member("java");
        final Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);

        System.out.println(set);

        final Member searchValue = new Member("JPA");
        final boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
