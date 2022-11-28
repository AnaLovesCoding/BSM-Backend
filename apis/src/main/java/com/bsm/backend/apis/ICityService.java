package com.bsm.backend.apis;

import java.util.List;

public interface ICityService {

    List<City> findAllCities();

    City findCityById(long id);

    City saveCity(City city);

    City deleteCity(City city);
}
