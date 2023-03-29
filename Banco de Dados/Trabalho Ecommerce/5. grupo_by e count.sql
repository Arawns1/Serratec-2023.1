-- Count() - conta a quantidade de pedidos
select Count(id) as numero_pedidos from pedido;

-- Adicionando um novo produto para aumentar o número de produtos por categoria
insert into produto(nome, descricao, data_fabricacao, valor_unitario, id_categoria)
values ("Celular","Hi-Tech", "12/09/2023", 100, 2);

-- Group by () - Fala quantos produtos tem por categoria
select c.nome, Count(id_categoria) as produtos_categoria from produto p 
inner join categoria c on c.id = p.id_categoria 
group by p.id_categoria;
