package com.alexbusf.crudalexbusf.services;

import com.alexbusf.crudalexbusf.models.Thing;
import com.alexbusf.crudalexbusf.repositories.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingService{
    @Autowired
    private ThingRepository thingRepository;

    public Thing createThing(Thing thing){

        return thingRepository.save(thing);
    }

    public List<Thing> readThings(){

        return thingRepository.findAll();
    }

    public Thing updateThing(Thing thing){

        return thingRepository.save(thing);
    }

    public void deleteThing(Thing thing){

        thingRepository.delete(thing);
    }
}
