SELECT c.id, c.name, a.name, a.id FROM students
    INNER JOIN assignments a on a.id = students.assignment_id
    INNER JOIN courses c on c.id = students.course_id
    INNER JOIN teachers t on t.id = students.teacher_id;