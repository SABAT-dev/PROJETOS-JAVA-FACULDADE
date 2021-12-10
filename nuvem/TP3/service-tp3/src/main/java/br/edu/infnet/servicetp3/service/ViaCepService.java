package br.edu.infnet.cadastroservice.service;

@FeignClient(url = "https://viacep.com.br/ws", name = "viaCepService")
public interface ViaCepService {


}
