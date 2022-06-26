import java.util.ArrayList;
import java.util.List;

public class ItemRepositoryImpl implements ItemRepository{
     List<Item> listItem = new ArrayList<Item>();

    public void addItem(List<Item> listItem){
        this.listItem=listItem;
    }
    @Override
    public List<Item> findAll() {

        return listItem;
    }

    @Override
    public double getPricebyId(String id) {
        double price=0;
        for (int i = 0; i < listItem.size(); i++) {
            if(listItem.get(i).getId().equals(id)){
                price = listItem.get(i).getPrice();
            }
        }
        return price;
    }

    @Override
    public String getNamebyId(String id) {
        for (Item item:listItem) {
            if(item.getId().equals(id)){
                return item.getName();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "ItemRepositoryImpl{" +
                "listItem=" + listItem +
                '}';
    }
}
