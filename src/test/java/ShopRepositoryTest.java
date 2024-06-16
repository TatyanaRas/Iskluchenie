import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    PurchaseItem item1 = new PurchaseItem(11,1, "хлеб", 20,7);
    PurchaseItem item2 = new PurchaseItem(11,1, "хлеб", 20,7);
    PurchaseItem item3 = new PurchaseItem(11,1, "хлеб", 20,7);
    @Test

    public void test() {
        ShopRepository repo = new ShopRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.reemoveById(100);
        });

    }

}
