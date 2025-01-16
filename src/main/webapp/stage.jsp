<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Stage Information</title>
</head>
<body style="background-color: lightblue;">


    <div align="center">
     <table border="1">
            <tr>
                <td>Stage Features</td>
            </tr>
            <tr>
             <td>Piano Information</td>
            </tr>

            <tr>
               <td>Model</td>
               <td>Color</td>
               <td>Octave</td>
            </tr>



    <c:forEach var="pianos" items="${piano}">

    <tr>
    <td>${pianos.getPianoFeatures().getModel()}</td>
    <td>${pianos.getPianoFeatures().getColor()}</td>
    <td>${pianos.getPianoFeatures().getOctave()}</td>
    </tr>

    </c:forEach>

    </table >
    </div>

    <div align="center">
    <table border="1">
      <tr>
             <td>Guitar Information</td>

             </tr>

              <tr>
               <td>Model</td>
               <td>Color</td>
               <td>Fret</td>
               <td>Knobs</td>
               <td>Pickups</td>
              </tr>

    <c:forEach var="guitars" items="${guitar}">
    <tr>
     <td>${guitars.getGuitarFeatures().getModel()}</td>
        <td>${guitars.getGuitarFeatures().getColor()}</td>
        <td>${guitars.getGuitarFeatures().getFret()}</td>
        <td>${guitars.getGuitarFeatures().getKnobs()}</td>
        <td>${guitars.getGuitarFeatures().getPickups()}</td>

    </tr>
    </c:forEach>

    </table>

    </div>
</body>
</html>