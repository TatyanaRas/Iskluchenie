import java.lang.module.ResolutionException;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String s) {
        super(s);
    }


public void removeById(int id) throws Exception {

        if (id == 0) {

             throw new NotFoundException(

             "Element with id: \" + id + \" not found"
            );
            //throw e;
        }
}

    public Product findById(int ID) {


        for (Product product : products) {
            if (id == product ) {

                return product;
            }
        }
        return null;
    }
}
