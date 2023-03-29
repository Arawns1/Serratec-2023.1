SELECT p.nome, descricao, id_vendedor, u.nome  from produto p 
inner join vendedor_produto vp on p.id = vp.id_produto 
inner join usuario u on vp.id_vendedor = u.id