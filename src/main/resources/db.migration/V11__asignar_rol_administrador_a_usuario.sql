INSERT INTO perfil_usuario (id_perfil, id_usuario)
VALUES ((SELECT id FROM perfiles WHERE nombre = 'ADMINISTRADOR'),
        (SELECT id FROM usuarios WHERE correo_electronico = 'admin@admin.com'));

INSERT INTO perfil_usuario (id_perfil, id_usuario)
VALUES ((SELECT id FROM perfiles WHERE nombre = 'USUARIO'),
        (SELECT id FROM usuarios WHERE correo_electronico = 'test@test.com'));