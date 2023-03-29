--Script Criação das Tabelas

create table endereco(
	id integer primary key autoincrement not null,
	cep text not null,
	pais text,
	estado text,
	cidade text,
	bairro text,
	rua text,
	numero text not null,
	complemento text
);

create table categoria(
	id integer primary key autoincrement not null,
	nome text not null,
	descricao text
);

create table usuario(
	id integer primary key autoincrement not null,
	nome text not null,
	id_endereco integer not null,
	telefone text,
	data_nascimento text not null,
	nome_usuario text not null unique,
	cpf text not null unique,
	email text not null,
	foreign key(id_endereco) references endereco(id)
);

create table produto(
	id integer primary key autoincrement not null,
	nome text not null,
	descricao text,
	data_fabricacao text,
	valor_unitario real not null,
	id_categoria integer,
	foreign key(id_categoria) references categoria(id)
);

create table pedido(
	id integer primary key autoincrement not null,
	id_comprador integer,
	data_compra text,
	foreign key(id_comprador) references usuario(id)
);

create table vendedor_produto(
	id integer primary key autoincrement not null,
	id_vendedor integer,
	id_produto integer,
	quantidade_estoque integer not null,
	foreign key(id_vendedor) references usuario(id),
	foreign key(id_produto) references produto(id)
);

create table pedido_produto(
	id integer primary key autoincrement not null,
	id_pedido integer,
	id_produto integer,
	quantidade_produto integer,
	foreign key(id_pedido) references pedido(id),
	foreign key(id_produto) references produto(id)
);
