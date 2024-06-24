package com.example.HR_system1.Controller;

import com.example.HR_system1.models.Empresa;
import com.example.HR_system1.models.Vaga;
import com.example.HR_system1.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmpresaController {

    @Autowired
    private EmpresaRepository er;

    @GetMapping("/empresa")
    public List<Empresa> listaempresa() {
        return er.findAll();
    }
}
