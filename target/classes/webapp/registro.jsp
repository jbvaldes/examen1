<!DOCTYPE html>
<html>
<head>
    <title>Registro de Clientes</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Registro de Clientes</h1>
    <form action="registro" method="post">
        <label for="rut">RUT:</label>
        <input type="text" id="rut" name="rut" required><br>
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido" required><br>
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion" required><br>
        <label for="correo">Correo:</label>
        <input type="email" id="correo" name="correo" required><br>
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required><br>
        <label for="nombreMascota">Nombre de la Mascota:</label>
        <input type="text" id="nombreMascota" name="nombreMascota" required><br>
        <button type="submit">Registrarse</button>
    </form>
</body>
</html>