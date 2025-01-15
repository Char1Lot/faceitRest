package ru.chariot.faceitparser.service;

import org.springframework.stereotype.Service;
import ru.chariot.faceitparser.model.ParsedData;
import ru.chariot.faceitparser.model.User;
import ru.chariot.faceitparser.repository.ParsedDataRepository;

import java.util.List;

@Service
public class ParsedDataService {
    private final ParsedDataRepository parsedDataRepository;

    public ParsedDataService(ParsedDataRepository parsedDataRepository){
        this.parsedDataRepository = parsedDataRepository;
    }

    public ParsedData saveParsedData(ParsedData parsedData){
        return parsedDataRepository.save(parsedData);
    }

    public ParsedData updateParsedData(Long id, ParsedData parsedData){
        ParsedData updatedParsedData = parsedDataRepository.findById(id).get();

        updatedParsedData.setResult(parsedData.getResult());
        updatedParsedData.setMap(parsedData.getMap());
        updatedParsedData.setDate(parsedData.getDate());
        updatedParsedData.setTime(parsedData.getTime());
        updatedParsedData.setType(parsedData.getType());
        updatedParsedData.setScore(parsedData.getScore());
        updatedParsedData.setUser(parsedData.getUser());

        return parsedDataRepository.save(updatedParsedData);
    }

    public void deleteParsedData(ParsedData parsedData){
        parsedDataRepository.delete(parsedData);
    }

    public ParsedData findParsedDataById(Long id){
        return parsedDataRepository.findById(id).get();
    }

    public List<ParsedData> findAll(){
        return parsedDataRepository.findAll();
    }

    public List<ParsedData> findByUser(User user) {
        return parsedDataRepository.findByUser(user);
    }

    public List<ParsedData> findByMap(String map){
        return parsedDataRepository.findByMap(map);
    }
}
