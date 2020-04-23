package com.example.DogRestApi.service;

import com.example.DogRestApi.entity.Dog;
import com.example.DogRestApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed(){
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id){
        return (String) dogRepository.findBreedById(id);
    }

    public List<String> retrieveDogNames(){
        return (List<String>) dogRepository.findAllName();
    }
}
