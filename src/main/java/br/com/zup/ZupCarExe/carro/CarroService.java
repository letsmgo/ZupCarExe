package br.com.zup.ZupCarExe.carro;

import br.com.zup.ZupCarExe.carro.dtos.CarroDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public CarroDto buscarCarroPorNome(String nomeDoCarro){
        for(CarroDto objeto : concessionaria){
            if(objeto.getModelo().equals(nomeDoCarro)){
                return objeto;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrei");
    }

}
