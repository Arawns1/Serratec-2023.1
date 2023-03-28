select * from pedido 
select * from vendedor_produto

select p.data_compra, u.nome as "cliente", 
	   p.id as "pedido id", 
	   vp.id_vendedor as "vendedor",
	   pp.id_produto, pr.nome as "nome produto",
	   pr.valor_unitario as "preço unitario",  
	   pp.quantidade_produto as "quantidade", 
	   valor_unitario * quantidade_produto as "total"
from pedido_produto pp

join pedido p
on pp.id_pedido = p.id 

join produto pr 
on pp.id_produto = pr.id 

join usuario u
on p.id_comprador = u.id 