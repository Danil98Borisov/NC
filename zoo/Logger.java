package zoo;

import zoo.model.animal.InterAnimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger extends InhibitionLog{
    List<InhibitionLog> inhibitionLogs = new ArrayList<>();

    public void addLogIn(InterAnimal animal, String result){
        inhibitionLogs.add(new InhibitionLog.Builder().
                withInDate(new Date()).
                withName(animal.getName()).
                withSpecies(animal.getSpecies()).
                withResult(result).
                build()
        );
    }

    public void addLogOut(InterAnimal animal, String result){
        inhibitionLogs.add(new InhibitionLog.Builder().
                withOutDate(new Date()).
                withName(animal.getName()).
                withSpecies(animal.getSpecies()).
                withResult(result).
                build()
        );
    }

    public List<InhibitionLog> getLogs(){
        return inhibitionLogs;
    }

}
