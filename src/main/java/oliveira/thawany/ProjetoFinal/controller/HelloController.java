package oliveira.thawany.ProjetoFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoasController {

    @GetMapping
    public String index()

    { return"Seja bem vindo ao cadastro de pessoas!"
    };
}