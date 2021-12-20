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

    @GetMapping
    public List<CarroDto> exibirCarros(){
        return carroService.exibirCarros();
    }

    @GetMapping("/{nomeDoCarro}")
    public CarroDto exibirCarro(@PathVariable String nomeDoCarro){
        return carroService.buscarCarroPorNome(nomeDoCarro);
    }

    @PutMapping("/{nomeDoCarro}")
    public CarroDto atualizarCarro(@PathVariable String nomeDoCarro, @RequestBody CarroDto carroDTO ) {
        return carroService.atualizarCarro(nomeDoCarro, carroDTO);
    }


}
