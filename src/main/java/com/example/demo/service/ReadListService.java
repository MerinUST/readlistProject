package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ReadList;
import com.example.demo.repository.ReadListRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReadListService {
    private final ReadListRepository readListRepository;

    @Autowired
    public ReadListService(ReadListRepository readListRepository) {
        this.readListRepository = readListRepository;
    }

    public ReadList saveReadList(ReadList readList) {
        return readListRepository.save(readList);
    }

    public List<ReadList> getAllReadLists() {
        return readListRepository.findAll();
    }

    public Optional<ReadList> getReadListById(long readListId) {
        return readListRepository.findById(readListId);
    }

    public void deleteReadListById(long readListId) {
        readListRepository.deleteById(readListId);
    }
}
