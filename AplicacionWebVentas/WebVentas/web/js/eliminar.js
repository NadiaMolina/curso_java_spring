var alPulsarBorrar = function () {
  

    var peticionHTTP = new XMLHttpRequest();

    peticionHTTP.onreadystatechange = function () {
        alert("Mensaje en Cliente (JS). Hemos recibido algo, nivel " + peticionHTTP.readyState);

        if (this.readyState === 4 && this.status === 200) {
            alert("Mensaje en Cliente (JS). Hemos recibido algo!!!! " + this.responseText);
            var jsonResp = this.responseText;
            var objResp = JSON.parse(jsonResp);
            var divInfo = document.getElementById("div_info");
            divInfo.style = "display:block";
            var mens = document.getElementById("mensaje");
            mens.innerHTML = objResp;
        }
    };


    peticionHTTP.open("POST", "Cliente.do", true);
    peticionHTTP.setRequestHeader("Content-type",
            "application/x-www-form-urlencoded");

    var cadenaEnvio =
            "email=" + encodeURIComponent(document.getElementById("email").value);

    alert("¿Qué se va a enviar?\n" + cadenaEnvio);
    peticionHTTP.send(cadenaEnvio);

};

document.getElementById("btn_borrar").onclick = alPulsarBorrar;