package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq a = new MemberNoHashNoEq("A");
        MemberNoHashNoEq b = new MemberNoHashNoEq("A");

        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("a.equals(b) = " + a.equals(b));

        set.add(a);
        set.add(b);

        System.out.println(set);

        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());

        boolean contains = set.contains(searchValue);

        System.out.println("contains = " + contains);
    }
}
