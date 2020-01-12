/**
 * 练习实例化
 * @author HYT
 */



public class Item {
    String name;
    int price;
    public static void main(String[] args){
        Item item1=new Item();
        item1.name="血瓶";
        item1.price=50;

        Item item2=new Item();
        item2.name="草鞋";
        item2.price=300;

        Item item3=new Item();
        item3.name="长剑";
        item3.price=350;

        String a="元";

        System.out.println(item1.name+item1.price+a+item2.name+item2.price+a+item3.name+item3.price+a);
    }
}
