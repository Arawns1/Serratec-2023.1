--Script para inserção de dados

insert into endereco (cep, pais, estado, cidade, bairro, rua, numero, complemento) 
values
('123', 'México','SP','Petrópolis','Centro','Maracana', '10', 'B'),
('321', 'Brasil','RJ','Rio de Janeiro','Bingen','16 de Maio', '10', 'B'),
('213', 'México','SP','Rio de Janeiro','Bingen','Ipiranga', '10', 'B'),
('231', 'EUA','SP','São Paulo','Tijuca','Maracana', '10', 'C'),
('124', 'Brasil','SP','Rio de Janeiro','Centro','Ipiranga', '10', 'B');

insert into categoria (nome, descricao) 
values 
('Cozinha', 'Itens para cozinha'),
('Eletrodomésticos', 'Itens para a sua comodidade'),
('Eletrônicos', 'Itens eletrônicos'), 
('Moda', 'Itens da moda'), 
('Móveis', 'Itens para mobiliar a casa');

insert into usuario (nome, id_endereco, telefone, nome_usuario, email, cpf, data_nascimento)
values  
('Rodolpho', 1, '2222-3939', 'rodolpho123', 'rodolpho@email.com', '12367829809', '29/09/2002'),
('Vitor', 2, '2224-3938', 'vitor983', 'vitor@email.com', '123123142344', '28/07/2000'),
('Maria', 3, '2332-3144', 'maria123', 'maria@email.com', '1435354315', '09/12/1991'),
('Tamirys', 4, '1222-3239', 'destroyer23', 'tamirys@email.com', '76124187634', '18/03/1989'),
('Gabriel', 5, '2121-3679', 'gabriel64', 'gabriel@email.com', '1238712667812', '25/09/2003');

insert into produto (nome, descricao, data_fabricacao, valor_unitario, id_categoria) 
values
('Conjunto de panelas', '5 panelas', '11/3/2019', 139.99, 1),
('Máquina de lavar roupas', 'Limpa direitinho!!', '12/4/94', 2499.99, 2),
('Serraphone', '128 gibas de memória', '1/4/2024', 4999.99, 3),
('Calça super leg', 'A calça mais leg do Brasil', '1/2/2023', 249.99, 4),
('Mesa', 'Mesa de jantar do milênio', '1/1/2001', 499.99, 5);

insert into vendedor_produto (id_vendedor, id_produto, quantidade_estoque) 
values 
(1 , 1, 3),
(2, 2, 3),
(3, 3, 4),
(4, 4, 9),
(5, 5, 4);

insert into pedido (id_comprador, data_compra) 
values
(1, '20/2/23'),
(2, '21/2/23'),
(3, '22/2/23'),
(4, '23/2/23'),
(5, '24/2/23');


insert into pedido_produto (id_pedido, id_produto, quantidade_produto)
values
(1, 1, 2),
(2, 2, 1),
(3, 4, 2),
(4, 4, 4),
(5, 5, 1);
