package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;





class ProductManagerTest {
     private ProductRepository repository = new ProductRepository();
     private Product prod1 = new Book(1,"HHHH",20,"LG");
     private Product prod2 = new Book(2,"MMMM",300,"KKKK");
     private Product prod3 = new Smartphone(3,"LG",500,"LG");

  @Test
    void searchBy() {
        repository.save(prod1);
        repository.save(prod2);
        repository.save(prod3);
        ProductManager manager = new ProductManager(repository);
        Product[] actual = manager.searchBy("KKKK");
        Product[] expected = new Product[]{prod2};

        assertArrayEquals(actual, expected);
    }

    @Test
    void searchBy2() {
        repository.save(prod1);
        repository.save(prod2);
        repository.save(prod3);
        ProductManager manager = new ProductManager(repository);
        Product[] actual = manager.searchBy("LG");
        Product[] expected = new Product[]{prod1,prod3};

        assertArrayEquals(actual, expected);
    }
    @Test
    void searchBy3() {
        repository.save(prod1);
        repository.save(prod2);
        repository.save(prod3);
        ProductManager manager = new ProductManager(repository);
        Product[] actual = manager.searchBy("Nothing");
        Product[] expected = new Product[]{};

        assertArrayEquals(actual, expected);
    }

}