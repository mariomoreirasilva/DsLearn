INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course(name, img_Uri, img_Gray_Uri) VALUES('Bootcamp HTML', 'https://www.femerj.org.br/wp-content/uploads/2024/06/image-from-rawpixel-id-5913662-jpeg-1-930x620.jpg', 'https://pepsic.bvsalud.org/img/revistas/pef/v7n1/n1a05t3.JPG'); 

INSERT INTO tb_offer(edition, star_Moment, end_Moment, course_id) VALUES('1.0', TIMESTAMP WITH TIME ZONE '2020-07-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-07-13T03:00:00Z',1);
INSERT INTO tb_offer(edition, star_Moment, end_Moment, course_id) VALUES('2.0', TIMESTAMP WITH TIME ZONE '2020-08-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-08-13T03:00:00Z',1);

INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES('Trilha HTML', 'Trilha principal do curso', 1, 'https://www.femerj.org.br/wp-content/uploads/2024/06/image-from-rawpixel-id-5913662-jpeg-1-930x620.jpg', 1, 1);
INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES('Formu', 'Tire suas dúvidas', 2, 'https://www.femerj.org.br/wp-content/uploads/2024/06/image-from-rawpixel-id-5913662-jpeg-1-930x620.jpg', 2, 1);
INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES('Bônus', 'Exclusivos para a turma', 3, 'https://www.femerj.org.br/wp-content/uploads/2024/06/image-from-rawpixel-id-5913662-jpeg-1-930x620.jpg', 0, 1);