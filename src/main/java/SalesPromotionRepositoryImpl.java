import java.util.List;

public class SalesPromotionRepositoryImpl implements SalesPromotionRepository{
    List<SalesPromotion> salesPromotionList;

    @Override
    public List<SalesPromotion> findAll() {
        return salesPromotionList;
    }
    public void addSalesPromotion(List<SalesPromotion> salesPromotionList){
        this.salesPromotionList=salesPromotionList;
    }


}
