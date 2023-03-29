-- JOIN Usuario - Endereco
SELECT * from endereco e2 
select u.id, 
u.nome,
u.nome_usuario, 
u.telefone, 
u.cpf, 
u.data_nascimento, 
e.cep, 
e.rua, 
e.bairro, 
e.cidade, 
e.estado, 
e.pais from usuario u
inner join endereco e 
on u.id_endereco  = e.id

-- JOIN Produto - categoria 
select p.id as id_produto, 
p.nome as nome_produto, 
p.descricao as desc_produto, 
c.nome as nome_categoria, 
c.descricao as desc_categoria, 
p.data_fabricacao, 
p.valor_unitario from produto p
inner join categoria c 
on p.id_categoria = c.id