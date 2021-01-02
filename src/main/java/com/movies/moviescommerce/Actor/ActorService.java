package com.movies.moviescommerce.Actor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URI;

//@EnableCircuitBreaker
@Service
public class ActorService {

    private final RestTemplate restTemplate;

    public ActorService(@Lazy RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public String readingList() {
        URI uri = URI.create("http://localhost:9090/recommended");

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliable() {
        return "Cloud Native Java (O'Reilly)";
    }

    /*private final CircuitBreakerFactory circuitBreakerFactory;
    private static final Logger LOGGER = LoggerFactory.getLogger(ActorService.class);

    public ActorService(CircuitBreakerFactory circuitBreakerFactory) {
        this.circuitBreakerFactory = circuitBreakerFactory;
    }

    public List<Actor> actorService(int id) {
        var restTemplate = new RestTemplate();

        return circuitBreakerFactory.create("getMovieActors").run(
                () -> restTemplate.exchange(
                        "http://localhost:9090/Actors/" + id,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Actor>>() {
                        }).getBody(),
                t -> {
                    LOGGER.error("getMovieActors call failed", t);
                    return defaultActors();
                }
        );
    }

    private static List<Actor> defaultActors() {
        return List.of(new Actor(1, "John", null));
    }*/



}
