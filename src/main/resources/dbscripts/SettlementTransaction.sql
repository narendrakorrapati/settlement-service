-- Insert sample data into settlement_transactions_seq table
INSERT INTO settlement_transactions_seq (next_val) VALUES (1);

-- Insert sample data into settlement_transactions table
INSERT INTO settlement_transactions (id_col, acquirer, amount, date_time, issuer, msg_type, resp_code, seq_num)
VALUES
(1, 'ABC', 100.50, '2024-01-26 10:15:00', 'XYZ', 'INQ', '0000', '000001'),
(2, 'DEF', 75.20, '2024-01-26 11:30:00', 'LMN', 'PUR', '1234', '000002'),
(3, 'GHI', 150.75, '2024-01-26 12:45:00', 'OPQ', 'SALE', '9876', '000003'),
(4, 'JKL', 50.00, '2024-01-26 14:00:00', 'RST', 'REF', '9999', '000004'),
(5, 'MNO', 200.30, '2024-01-26 15:15:00', 'UVW', 'VOID', '8888', '000005'),
(6, 'PQR', 125.60, '2024-01-26 16:30:00', 'XYZ', 'INQ', '0000', '000006'),
(7, 'STU', 80.90, '2024-01-26 17:45:00', 'LMN', 'PUR', '1234', '000007'),
(8, 'VWX', 300.25, '2024-01-26 19:00:00', 'OPQ', 'SALE', '9876', '000008'),
(9, 'YZA', 40.75, '2024-01-26 20:15:00', 'RST', 'REF', '9999', '000009'),
(10, 'BCD', 180.00, '2024-01-26 21:30:00', 'UVW', 'VOID', '8888', '000010');

UPDATE settlement_transactions_seq SET next_val = 11;