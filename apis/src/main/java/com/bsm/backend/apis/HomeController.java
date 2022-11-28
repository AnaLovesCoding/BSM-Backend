package com.bsm.backend.apis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@RequiredArgsConstructor
public class HomeController {

    private final ICityService cityService;

    @GetMapping("")
    public List<City> findAllCities() {
        return cityService.findAllCities();
    }

    @GetMapping("/{id}")
    public City FindCityById(@PathVariable long id) {
        return cityService.findCityById(id);
    }

    @PostMapping("")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @DeleteMapping("")
    public City deleteCity(@RequestBody City city) {
        return cityService.deleteCity(city);
    }
}
