<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Cuentas</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Gestión de Cuentas</h1>
    <form action="cuenta" method="post">
        <label for="rutCliente">RUT del Cliente:</label>
        <input type="text" id="rutCliente" name="rutCliente" required><br>
        <label for="monto">Monto:</label>
        <input type="number" id="monto" name="monto" required><br>
        <label for="ejecutivo">Ejecutivo:</label>
        <input type="text" id="ejecutivo" name="ejecutivo" required><br>
        <button type="submit">Crear Cuenta</button>
    </form>
</body>
</html>