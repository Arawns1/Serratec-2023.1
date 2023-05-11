--Inserindo Editoras
INSERT INTO public.editoras (nome) VALUES ('Editora 1'), ('Editora 2');

-- Inserindo Alunos
INSERT INTO public.alunos (nome,data_nascimento,logradouro,numero_logradouro,complemento,bairro,cidade) VALUES ('Alfredo','1980-07-20',NULL,NULL,NULL,NULL,NULL), ('Gilberto','1984-07-15',NULL,NULL,NULL,NULL,NULL), ('Astolfo','1990-05-31',NULL,NULL,NULL,NULL,NULL), ('Espiriquidiberto','1982-10-25',NULL,NULL,NULL,NULL,NULL);

--Inserindo Livros
INSERT INTO public.livros (nome_livro,nome_autor,data_lancamento,codigo_isbn,codigo_editora) VALUES ('Livro 1',NULL,NULL,354897,1), ('Livro 2',NULL,NULL,546578,1), ('Livro 3',NULL,NULL,15869,2), ('Livro sem editora',NULL,NULL,85472,1);

--Inserindo Empréstimos
INSERT INTO public.emprestimos (numero_matricula_aluno,codigo_livro,data_emprestimo,data_entrega,valor_emprestimo) VALUES (1,1,'2021-04-16','2020-07-27',35.00), (2,2,'2021-04-16',NULL,35.00), (4,3,'2021-04-16',NULL,20.00), (4,1,'2021-04-16',NULL,20.00),(1,2,'2021-04-16',NULL,10.00);