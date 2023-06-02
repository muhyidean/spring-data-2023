-- USERS

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (111, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (112, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (113, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (114, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (115, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (116, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123


-- PRODUCTS

INSERT INTO product (id, name, price, user_id)
VALUES (111, 'iPhone', 1200, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (112, 'iPad', 900, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (113, 'Speakers', 100, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (114, 'SD Card', 50, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (115, 'Fridge', 1500, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (116, 'Smart TV', 1800, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (117, 'MacBook', 1800, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (118, 'Smart Watch', 320, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (119, 'MacBook Air', 800, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (120, 'iPad Pro', 1200, 111);

INSERT INTO product (id, name, price, user_id)
VALUES (121, 'Pen', 5, 112);

-- REVIEWS

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (1,'awesome phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (2,'awesome !',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (3,'it sucks',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (4,'its great',4,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (5,'awesome phone',4,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (6,'amazing phone',3,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (7,'awesome phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (8,'amazing phone',4,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (9,'awesome phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (10,'amazing phone',5,111);


INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (11,'awesome tablet',5,112);


-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,1);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,2);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,3);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,4);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,5);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,6);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,7);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,8);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,9);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (111,10);
-- INSERT INTO PRODUCT_REVIEWS (product_id , reviews_id)
-- VALUES (112,11);
