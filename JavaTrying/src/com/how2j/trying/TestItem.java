package com.how2j.trying;
/*
public class TestItem {
	public static void main(String[] args) {
		Item item1 = new Item("血瓶",50);
		System.out.println("物品名称："+item1.getName()+",物品价格："+item1.getPrice());
		
		Item item2 = Item.createObj();
		item2.setName("长剑 ");
		item2.setPrice(350);
		System.out.println("物品名称："+item2.getName()+",物品价格："+item2.getPrice());
	}

}
*/
public class TestItem  {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }
     
    public static void main(String[] args) {
        new TestItem().method1(5);
        //结果打印出来是 1还是5?
    }
}