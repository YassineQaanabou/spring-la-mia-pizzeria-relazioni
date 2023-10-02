SET FOREIGN_KEY_CHECKS=0;
INSERT INTO pizzas (description, img, name, price) VALUES('pomodoro, origano', "https://upload.wikimedia.org/wikipedia/commons/1/11/Pizza_marinara.jpg", "Marinara",4.00);
INSERT INTO pizzas (description, img, name, price) VALUES('pomodoro, mozzarella, origano', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg/260px-Eq_it-na_pizza-margherita_sep2005_sml.jpg', "Margherita",4.99);
INSERT INTO pizzas (description, img, name, price) VALUES('pomodoro, mozzarella, funghi', 'https://www.petitchef.it/imgupl/recipe/pizza-ai-funghi-freschi--455627p707846.jpg', "Funghi",5.99);
INSERT INTO pizzas (description, img, name, price) VALUES('pomodoro, mozzarella, wurstel, patatine', 'https://www.scattidigusto.it/wp-content/uploads/2015/11/pizza-wurstel-patatine-pomodoro.jpg', "Wurstel e patatine",5.99);
INSERT INTO offers (pizza_id, title, start_date, end_date ) VALUES(1 ,'natale', '2023-12-01' ,'2023-12-31');
INSERT INTO offers (pizza_id, title, start_date, end_date ) VALUES(1 ,'offerta attuale', '2023-08-01' ,'2023-12-31');
INSERT INTO offers (pizza_id, title, start_date, end_date ) VALUES(2 ,'pasqua', '2024-04-01' ,'2024-04-30');
INSERT INTO offers (pizza_id, title, start_date, end_date ) VALUES(3 ,'ferragosto', '2024-08-15' ,'2024-08-16');
INSERT INTO offers (pizza_id, title, start_date, end_date ) VALUES(4 ,'halloween', '2023-10-01' ,'2023-10-31');
INSERT INTO ingredients (name) VALUES('Pomodoro');
INSERT INTO ingredients (name) VALUES('Mozzarella');
INSERT INTO ingredients (name) VALUES('Origano');
INSERT INTO ingredients (name) VALUES('Funghi');
INSERT INTO ingredients (name) VALUES('Wurstel');
INSERT INTO ingredients (name) VALUES('Patatine');
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(1, 1);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(1, 3);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(2, 1);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(2, 2);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(2, 3);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(3, 1);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(3, 2);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(3, 4);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(4, 1);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(4, 2);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(4, 5);
INSERT INTO pizza_ingredients (pizza_id, ingredient_id) VALUES(4, 6);
INSERT INTO users (username, password) VALUES('cliente@gmail.com', 'cliente');
INSERT INTO users (username, password) VALUES('pizzaiolo@gmail.com', 'pizzaiolo');
INSERT INTO roles (name) VALUES('cliente');
INSERT INTO roles (name) VALUES('pizzaiolo');

















