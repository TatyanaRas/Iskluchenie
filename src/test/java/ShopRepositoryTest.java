import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test

    public void removeIdExisting() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "хлеб", 60);
        Product product2 = new Product(10, "макароны", 40);
        Product product3 = new Product(17, "морс", 20);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
       // repo.remove(1);

    //    Product[] actual = repo.findAll();
   //     Product[] expected = {product2, product3};

   //     Assertions.assertArrayEquals(expected, actual);
         Assertions.assertThrows(NotFoundException.class, () -> {
                 repo.remove(1);
           });

    }

    @Test

    public void removeIdNotExisting() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "хлеб", 60);
        Product product2 = new Product(2, "макароны", 40);
        Product product3 = new Product(3, "морс", 20);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(17);
        });

    }
}

