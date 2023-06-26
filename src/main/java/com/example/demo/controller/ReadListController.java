package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ReadList;
import com.example.demo.service.ReadListService;

@RestController
@RequestMapping("/readlists")
public class ReadListController {
    private final ReadListService readListService;

    @Autowired
    public ReadListController(ReadListService readListService) {
        this.readListService = readListService;
    }

    @PostMapping("/list")
    public ResponseEntity<ReadList> saveReadList(@RequestBody ReadList readList) {
        ReadList savedReadList = readListService.saveReadList(readList);
        return new ResponseEntity<>(savedReadList, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<ReadList>> getAllReadLists() {
        List<ReadList> readLists = readListService.getAllReadLists();
        return new ResponseEntity<>(readLists, HttpStatus.OK);
    }

    @GetMapping("/{readListId}")
    public ResponseEntity<ReadList> getReadListById(@PathVariable long readListId) {
        Optional<ReadList> readList = readListService.getReadListById(readListId);
        return readList.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{readListId}")
    public ResponseEntity<Void> deleteReadListById(@PathVariable long readListId) {
        readListService.deleteReadListById(readListId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

