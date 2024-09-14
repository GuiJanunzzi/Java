create table t_carro (
    id_carro number(10) PRIMARY KEY,
    ds_modelo varchar(80) not null,
    nr_placa varchar(7),
    ds_motor number(2,1),
    ds_automatico number(1)
);

create sequence sq_t_carro INCREMENT by 1 START with 1 nocache;

--Inserir uma linha na tabela

--Inserir uma linha na tabela
insert into t_carro (id_carro, ds_modelo, nr_placa, ds_motor, ds_automatico) values (sq_t_carro.nextval, 'Onix', 'FJU5015', 1, 0);

--selecionar todos os registros da tabela
select * from t_carro;