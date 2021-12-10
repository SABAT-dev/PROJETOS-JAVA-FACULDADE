package br.edu.infnet.nuvemtp3.service;

import br.edu.infnet.nuvemtp3.service.dto.DtoEndereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient( url = "https://viacep.com.br/ws/", name = "viaCepService")
public interface ViaCepService {
	
	    @GetMapping("{cep}/json")
		DtoEndereco findByEndereco(@PathVariable("cep") String cep);

}


