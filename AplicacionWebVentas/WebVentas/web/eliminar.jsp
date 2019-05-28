
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar con REST</title>
    </head>
    <body>
        <h1>Borrar con  REST</h1>

        <form name="form1" id="form1">

            <label for="email"> Email: </label> 
            <input id="email" name="email" type="email" required="required" size="50" maxlength="250"/>
            <br/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input id="btn_borrar" type="button" value="Borrar"/>

        </form>
       <div id="div_info" style="display: none">
           <p>  <span id="mensaje">...</span> </p>
        </div>
        <script src="js/eliminar.js"></script>
    </body>
</html>