INSERT INTO user (id, name) VALUES
(1, 'Ali'),
(2, 'Ulker');

INSERT INTO todo (id, description, week) VALUES
(1, 'todos for Ali', 0),
(2, 'todos for Ulker', 0);

INSERT INTO user_todo (user_id, todo_id) VALUES
(1, 1),
(2, 2);
