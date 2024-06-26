package com.example.HR_system1.Controller;

import com.example.HR_system1.Dtos.VagaDto;
import com.example.HR_system1.models.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.HR_system1.repository.VagaRepository;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VagaController {

    @Autowired
    private VagaRepository vr;

    @GetMapping("/vagasdto")
    public List<VagaDto> listaVagasDto() {
        List<Vaga> vagas = vr.findAll();
        return vagas.stream().map(vaga -> new VagaDto(
                vaga.getNome(),
                vaga.getLocalidade(),
                vaga.getModalidade(),
                vaga.getDescricao(),
                vaga.getEmpresa().getNome(),
                Integer.parseInt(vaga.getSalario()),
                vaga.getNumDeVagas(),
                vaga.getFormaçãoAcademica(),
                vaga.getResponsabilidadeEAtribuicoes()
        )).collect(Collectors.toList());
    }
}
