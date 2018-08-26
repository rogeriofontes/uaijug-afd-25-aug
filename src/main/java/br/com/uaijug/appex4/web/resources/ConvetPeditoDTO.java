package br.com.uaijug.appex4.web.resources;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.uaijug.appex4.model.domain.Pedido;

@Component
public class ConvetPeditoDTO implements Converter<PedidoTO, Pedido> {

	@Override
	public Pedido convert(PedidoTO source) {
		Pedido pedido = new Pedido();
		pedido.setCliente(source.getCliente());
		pedido.setProdutos(source.getProdutos());
		pedido.setTitulo(source.getTitulo());
		return pedido;
	}

}
