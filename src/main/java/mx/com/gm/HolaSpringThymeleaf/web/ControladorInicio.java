package mx.com.gm.HolaSpringThymeleaf.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.gm.HolaSpringThymeleaf.dao.PersonaDao;
import mx.com.gm.HolaSpringThymeleaf.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PersonaDao personaDAO;

    @GetMapping("/")
    public String inicio(Model model){

        var personas = personaDAO.findAll();
        model.addAttribute("personas",personas);

        log.info("ejecutando el controlador spring MVC");
        return "index";
    }
}
