create view nota_fiscal_view as
	select
		   p.data_compra, 
		   u.nome as "cliente",
		   u.cpf as "CPF_Cliente",
		   p.id as "pedido id", 
		   vp.id_vendedor as "vendedor",
		   uv.nome as "Nome_vendedor",
		   pp.id_produto, pr.nome as "nome produto",
		   pr.valor_unitario as "preço unitario",  
		   pp.quantidade_produto as "quantidade", 
		   valor_unitario * quantidade_produto as "total"
	from pedido_produto pp
	
	inner join pedido p
	on pp.id_pedido = p.id 
	
	inner join produto pr 
	on pp.id_produto = pr.id 
	
	inner join usuario u
	on p.id_comprador = u.id 
	
	inner join usuario uv
	on vp.id = u.id 
	
	inner join vendedor_produto vp 
	on uv.id = vp.id_vendedor

	order by p.data_compra asc

select * from nota_fiscal_view
where "pedido id" = 2
