SELECT ages.name, ages.surname, ages.age FROM (
    SELECT name, surname, (date_part('year', current_date) - date_part('year', birthdate)) AS age FROM students
    ) AS ages
WHERE ages.age<18 OR ages.age>40;
