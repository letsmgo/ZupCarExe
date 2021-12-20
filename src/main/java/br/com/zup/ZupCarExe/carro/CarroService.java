package br.com.zup.ZupCarExe.carro;

import br.com.zup.ZupCarExe.carro.dtos.CarroDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {
    private List<CarroDto> concessionaria = new ArrayList<>();

    public void salvarCarro (CarroDto carroDto){
        concessionaria.add(carroDto);
    }

    public List<CarroDto> exibirCarros(){
        return concessionaria;
    }
}
