<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ZODIACO MALDITO</h1>
        <form action="horoscopo.xls" method="post" >
            <p> Pon tu nombre:!!! </p>
            <input type="text" name="nombre"/><br>
            <select name="signo"> 
                <!-- Lista desplegable -->
                <option>Sagitario</option>
                <option>Libra</option>
                <option>Acuario</option>
                <option>Piscis</option>
                <option>Tauro</option>
                <option>Escorpion</option>
                <option>Virgo</option>
                <option>Cancer</option>
                <option>Geminis</option>
                <option>Capricornio</option>
                <option>Aries</option>
                <option>Leo</option>
            </select>  
            <input type="submit" value="Puchale Aquí"/>
        </form>
        
    </body>
</html>

