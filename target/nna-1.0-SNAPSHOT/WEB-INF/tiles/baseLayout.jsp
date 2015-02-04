<%-- 
    Document   : baseLayout
    Created on : 04.feb.2015, 19:06:38
    Author     : Borgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<html>
    <head>
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body bgcolor="gray" >
        <table border="0" cellpadding="0" cellspacing="0" width="100%" align="center">
            <tr>
                <td width="100%" height="100" valign="top">
                    <tiles:insertAttribute name="menu" />
                </td>
            </tr>
            <tr>
               <td width="100%" valign="top">
                    <br>
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
        </table>
    </body>
</html>
