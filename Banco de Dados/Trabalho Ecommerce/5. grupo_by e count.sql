-- Count() - conta a quantidade de pedidos
select Count(id) from pedido

-- Group by () - Fala quantos produtos tem por categoria
select Count(id_categoria) from produto p 
group by p.id_categoria
