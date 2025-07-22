CREATE DATABASE rooftop;

USE rooftop;

CREATE TABLE customer_orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_time INT NOT NULL,
    travel_time INT NOT NULL
);

-- Sample data
INSERT INTO customer_orders (order_time, travel_time) VALUES
(1, 10),
(4, 20),
(15, 5),
(22, 20),
(24, 10),
(25, 10);
