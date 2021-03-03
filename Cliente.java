package POO;

public class Cliente {
	private String pedido;
	private String brinde;
	
	public Cliente (String pediu, String veio)
	{
		pedido = pediu;
		brinde = veio;
	}
	
	public String getPedidoCliente()
	
	{
		String PedidioCliente = pedido+brinde;
	return 	PedidoCliente;
			
	}

}
