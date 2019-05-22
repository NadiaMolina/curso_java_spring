
console.log("Generando tabla...");
var lista = new Array();
lista = [["Comida", "Lechuga", "3$", "7"]];
lista [1] = ["Menaje", "Plato", "10$", "3"];
lista [2] = ["Ropa", "Camisa", "20$", "2"];

generarTabla();
function guardar() {
    var tipo = document.getElementById("tipo").value;
    var nom = document.getElementById("nom").value;
    var precio = document.getElementById("precio").value;
    var stock = document.getElementById("stock").value;
    var fila = lista.length;
    lista[fila] = [tipo, nom, precio, stock];
    lista.push([tipo, nom, precio, stock]); //para añadir una fila a la tabla

    generarTabla();
}
function generarTabla() {
    var table = document.getElementsByTagName("table");
    table = table [0];
    table.innerHTML = "<caption>Lista de cosas</caption>";
    var nombrePrecio = "Precio";
    table.innerHTML += `
    <thead>
        <tr>
            <th>Tipo</th>
            <th>Nombre</th>
            <th>${nombrePrecio}</th>
            <th>Stock</th>
        </tr>
    </thead> `;

    for (var i = 0; i < lista.length; i++) {
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista [i]) {
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
        }
    }
}

/*function agregarCosaDirectamente() {
    var table = document.getElementById("table")[0];
    var tipo = document.getElementById("tipo").value;
    var nom = document.getElementById("nom").value;
    var precio = document.getElementById("precio").value;
    var stock = document.getElementById("stock").value;
    table.innerHTML += `<tr>
<td>$(tipo)</td><td>$(nom)</td><td>$(precio)</td><td>$(stock)</td></tr>`;

}*/



