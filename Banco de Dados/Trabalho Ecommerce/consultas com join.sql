select * from pedido
select * from vendedor_produto

select p.data_compra, u.nome as "cliente", p.id as "pedido id", pp.id_produto, pr.nome as "nome produto" , pr.valor_unitario,  pp.quantidade_produto from pedido_produto pp

join pedido p
on pp.id_pedido = p.id 

join produto pr 
on pp.id_produto = pr.id 

join usuario u
on p.id_comprador = u.id 
