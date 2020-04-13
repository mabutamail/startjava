--выведите всю таблицу
SELECT * FROM jaegers;

--отобразите только не уничтоженных роботов
SELECT * FROM jaegers WHERE jaegers_status = 'active';

--отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE jaegers_mark = 'mark-1' OR jaegers_mark = 'mark-6';

--отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY jaegers_mark DESC;

--отобразите самого старого робота
SELECT * FROM jaegers WHERE jaegers_launch = (SELECT MIN(jaegers_launch) FROM jaegers);

--отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE jaegers_kaijuKill = (SELECT MAX(jaegers_kaijuKill) FROM jaegers);

SELECT * FROM jaegers WHERE jaegers_kaijuKill = (SELECT MIN(jaegers_kaijuKill) FROM jaegers);

--отобразите средний вес роботов
SELECT AVG(jaegers_weight) FROM jaegers;

--увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET jaegers_kaijuKill = jaegers_kaijuKill + 1 WHERE jaegers_status = 'active';

--удалите уничтоженных роботов
DELETE FROM jaegers WHERE jaegers_status = 'Destroyed';
