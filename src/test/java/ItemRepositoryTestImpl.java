import java.util.List;

public class ItemRepositoryTestImpl implements ItemRepository{
    @Override
    public List<Item> findAll() {
        return TestData.ALL_ITEMS;
    }

    @Override
    public double getPricebyId(String id) {
        return 0;
    }

    @Override
    public String getNamebyId(String id) {
        return null;
    }
}
