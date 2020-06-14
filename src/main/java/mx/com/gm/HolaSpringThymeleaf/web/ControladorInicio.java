package mx.com.gm.HolaSpringThymeleaf.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.gm.HolaSpringThymeleaf.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo con thymeleaf";
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);

        var persona= new Persona();
        persona.setNombre("Florencia");
        persona.setApellido("Castro");
        persona.setEmail("minombre@gmail.com");
        persona.setTelefono("1564079503");
        model.addAttribute("persona",persona);

        var persona2= new Persona();
        persona2.setNombre("Corina");
        persona2.setApellido("Martinez");
        persona2.setEmail("elhombre@gmail.com");
        persona2.setTelefono("1564079503");
        model.addAttribute("persona2",persona2);

        //var personas = Arrays.asList(persona,persona2);
        var personas = new ArrayList<>();
        model.addAttribute("personas",personas);

        log.info("ejecutando el controlador spring MVC");
        return "index";
    }
}
