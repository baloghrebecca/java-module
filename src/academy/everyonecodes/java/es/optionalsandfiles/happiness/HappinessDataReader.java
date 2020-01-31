package academy.everyonecodes.java.es.optionalsandfiles.happiness;

import academy.everyonecodes.java.evaluation1.tools.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    private FileReader fileReader = new FileReader();
    private HappinessDataParser happinessDataParser = new HappinessDataParser();

    public List<HappinessRecord> read() {

        String file = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";
        List<String> dataList = fileReader.read(file);
        List<HappinessRecord> happinessRecordList = new ArrayList<>();
        if (dataList.isEmpty()) {
            return new ArrayList<>();
        }
        removeHeaders(dataList);
        for (String data : dataList) {
            Optional<HappinessRecord> oHappinessRecord = happinessDataParser.parse(data);
            addHappinessRecordToList(happinessRecordList, oHappinessRecord);
        }

        return happinessRecordList;
    }

    private void addHappinessRecordToList(List<HappinessRecord> happinessRecordList, Optional<HappinessRecord> oHappinessRecord) {
        if (oHappinessRecord.isPresent()) {
            happinessRecordList.add(oHappinessRecord.get());
        }
    }

    private void removeHeaders(List<String> lines) {
        lines.remove(0);
    }

}
