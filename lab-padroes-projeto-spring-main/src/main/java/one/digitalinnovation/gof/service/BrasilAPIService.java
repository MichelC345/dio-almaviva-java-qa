package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.dto.CnpjResponse;

//https://brasilapi.com.br/api/cnpj/v1/{cnpj}
@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br/api/")
public interface BrasilAPIService {

	@GetMapping("/cnpj/v1/{cnpj}/")
	CnpjResponse consultarCnpj(@PathVariable("cnpj") String cnpj);
}
