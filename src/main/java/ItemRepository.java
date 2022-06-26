import java.util.List;

public interface ItemRepository {
    List<Item> findAll();

    public double getPricebyId(String id);
    public String getNamebyId(String id);
}
