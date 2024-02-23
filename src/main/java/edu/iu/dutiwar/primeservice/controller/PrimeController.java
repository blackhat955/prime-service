package edu.iu.dutiwar.primeservice.controller;

import edu.iu.dutiwar.primeservice.service.IPrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/prime")
public class PrimeController {
    IPrimeService primeService;
    public PrimeController(IPrimeService primeService){
        this.primeService=primeService;
    }

    @GetMapping("/{n}")

    public boolean isPrime(@PathVariable int n){
        return primeService.isPrime(n);
    }
}
