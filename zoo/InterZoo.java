package zoo;

import zoo.model.animal.InterAnimal;

import java.util.List;

public interface InterZoo {
    void checkInAnimal(InterAnimal animal);
    void checkOutAnimal(InterAnimal animal);
    List<InhibitionLog> getHistory();
}
