<!DOCTYPE html>
<html>
<head>
    <title>Transferencias</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Transferencias</h1>
    <form action="transferencia" method="post">
        <label for="rutCliente">RUT del Cliente:</label>
        <input type="text" id="rutCliente" name="rutCliente" required><br>
        <label for="rutDueño">RUT del Dueño:</label>
        <input type="text" id="rutDueño" name="rutDueño" required><br>
        <label for="idCuenta">ID de la Cuenta:</label>
        <input type="number" id="idCuenta" name="idCuenta" required><br>
        <label for="montoTransferencia">Monto a Transferir:</label>
        <input type="number" id="montoTransferencia" name="montoTransferencia" required><br>
        <label for="cuentaTransferencia">Cuenta de Transferencia:</label>
        <input type="text" id="cuentaTransferencia" name="cuentaTransferencia" required><br>
        <label for="tipoCuenta">Tipo de Cuenta:</label>
        <input type="text" id="tipoCuenta" name="tipoCuenta" required><br>
        <button type="submit">Realizar Transferencia</button>
    </form>
</body>
</html>