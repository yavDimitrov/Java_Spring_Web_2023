package com.softuni.pathfinder.service;

import com.softuni.pathfinder.domain.dto.view.MostCommentedRouteViewDto;
import com.softuni.pathfinder.domain.entities.Route;
import com.softuni.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RouteService {


    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository){
        this.routeRepository=routeRepository;
    }

    public MostCommentedRouteViewDto getMostCommented() {

        final Route routes = this.routeRepository
                .findMostCommented()
                .orElseThrow(NoSuchElementException::new)
                .get(0);

       return MostCommentedRouteViewDto.fromRoute(routes);
    }
}
