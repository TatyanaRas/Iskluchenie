public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super("Элемент  id: " + id + " не найден");
    }

}






