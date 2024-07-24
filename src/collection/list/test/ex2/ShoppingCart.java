package collection.list.test.ex2;

import java.util.List;

public class ShoppingCart {

    private final List<Item> itemList;

    public ShoppingCart(final List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(final Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : itemList) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        System.out.println("전체 가격 합: " + getAllPrice());
    }

    private int getAllPrice() {
        int sum = 0;

        for (Item item : itemList) {
            sum += item.getTotalPrice();
        }

        return sum;
    }

}
