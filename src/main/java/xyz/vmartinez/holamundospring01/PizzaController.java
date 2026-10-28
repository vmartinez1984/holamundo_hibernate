package xyz.vmartinez.holamundospring01;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController 
public class PizzaController {

    @Autowired 
    IPizzaRepositorio repositorio;

    @GetMapping("/api/pizzas")
    public List<PizzaEntidad> obtnerTodo() {
        List<PizzaEntidad> pizzas = repositorio.findAll();

        return pizzas;
    }
    
    @PostMapping("/api/pizzas")
    public int agregar(PizzaEntidad entidad) {
        PizzaEntidad pizzaEntidad = repositorio.save(entidad);
        
        return pizzaEntidad.getId();
    }
    
}
