package mx.com.gm.HolaSpringThymeleaf.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.gm.HolaSpringThymeleaf.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model){

        var personas = personaService.listarPersonas();
        model.addAttribute("personas",personas);

        log.info("ejecutando el controlador spring MVC");
        return "index";
    }
}
