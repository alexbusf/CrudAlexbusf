package com.alexbusf.crudalexbusf.controllers;

import com.alexbusf.crudalexbusf.models.Thing;
import com.alexbusf.crudalexbusf.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thing")
public class ThingController {
    @Autowired
    private ThingService thingService;

    @PostMapping("")
    public Thing createThing(@RequestBody Thing thing){
        return thingService.createThing(thing);
    }

    @GetMapping("")
    public List<Thing> readThings(){
        return thingService.readThings();
    }

    @PutMapping("")
    public Thing updateThing(@RequestBody Thing thing){
        return thingService.updateThing(thing);
    }

    @PostMapping("/del")
    public void deteteThing(@RequestBody Thing thing){
        thingService.deleteThing(thing);
    }
}
