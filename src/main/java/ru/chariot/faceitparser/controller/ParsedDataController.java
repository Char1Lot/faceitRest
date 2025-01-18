package ru.chariot.faceitparser.controller;

import org.springframework.web.bind.annotation.*;
import ru.chariot.faceitparser.model.ParsedData;
import ru.chariot.faceitparser.service.ParsedDataService;
import java.util.List;

@RestController
@RequestMapping("/data")
public class ParsedDataController {
    private ParsedDataService parsedDataService;

    public ParsedDataController(ParsedDataService parsedDataService){
        this.parsedDataService = parsedDataService;
    }

    @PostMapping
    public ParsedData saveData(@RequestBody ParsedData data){
        return parsedDataService.saveParsedData(data);
    }

    @PutMapping("/{id}")
    public ParsedData putData(@PathVariable("id") Long id, @RequestBody ParsedData data){
        return parsedDataService.updateParsedData(id, data);
    }

    @DeleteMapping("/{id}")
    public ParsedData deleteData(@PathVariable("id") Long id){
        return parsedDataService.deleteParsedData(id);
    }

    @GetMapping("/alldata")
    public List<ParsedData> getAllData(){
        return parsedDataService.findAll();
    }

    @GetMapping("/byid/{id}")
    public ParsedData getDataById(@PathVariable("id") Long id){
        return parsedDataService.findParsedDataById(id);
    }

    @GetMapping("/byuser/{username}")
    public List<ParsedData> findDataByUser(@PathVariable String username){
        return parsedDataService.findByUser(username);
    }

    @GetMapping("/bymap/{map}")
    public List<ParsedData> findDataByMap(@PathVariable("map") String map){
        return parsedDataService.findByMap(map);
    }
}