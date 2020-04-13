--удалить старую БД если есть
DROP DATABASE  IF EXISTS basejava;

--создать новую БД
CREATE DATABASE basejava;

--удалить старую таблицу если есть
DROP TABLE IF EXISTS jaegers;

--создать новую таблицу
CREATE TABLE jaegers (
--id, modelName, mark, height, weight, status, origin, launch, kaijuKill
--serial  text char integer integer text  varchar date integer
    jaegers_id SERIAL PRIMARY KEY,
    jaegers_modelName TEXT not null default 'model',
    jaegers_mark CHAR(8) not null default 'mark',
    jaegers_height INTEGER not null default 0,
    jaegers_weight INTEGER not null default 0,
    jaegers_status TEXT not null default 'active',
    jaegers_origin VARCHAR (100) not null default 'Russia',
    jaegers_launch DATE not null,
    jaegers_kaijuKill INTEGER not null default 0
);
