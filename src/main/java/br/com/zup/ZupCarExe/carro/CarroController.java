package br.com.zup.ZupCarExe.carro;

import br.com.zup.ZupCarExe.carro.dtos.CarroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroService carroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarCarro(@RequestBody CarroDto carroDto){
        carroService.salvarCarro(carroDto);
    }

}
