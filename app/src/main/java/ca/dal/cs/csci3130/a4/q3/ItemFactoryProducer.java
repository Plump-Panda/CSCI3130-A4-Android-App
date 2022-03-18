package ca.dal.cs.csci3130.a4.q3;

public class ItemFactoryProducer {
    public static ItemFactory getFactory(boolean isSmallTask) {
        ItemFactory itemFactory;
        if(isSmallTask){
            itemFactory = new SmallTaskFactory();
        }else{
            itemFactory = new GoodsFactory();
        }

        return itemFactory;
    }
}
