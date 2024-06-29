/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 1:49 PM
 *
 */

INSERT INTO users (id, name, email, password) VALUES (1, 'Patrick Mutwiri', 'dev@patric.xyz', 'password') ON CONFLICT DO NOTHING;
INSERT INTO users (id, name, email, password) VALUES (2, 'Tester', 'tester@patric.xyz', 'password') ON CONFLICT DO NOTHING;