<%-- 
    Document   : index
    Created on : 04.feb.2015, 19:10:10
    Author     : Borgar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<h1>Hello World!</h1>

<spring:message code="indeks_melding" />

<div ng-app="chatApp" id="chat_app" ng-controller="ChatCtrl">
    <div id="stuff">
        Here goes stuff:
        <br>
        <div ng-repeat="message in user.messages">
            {{message}}
        </div>
    </div>
    <div id="button">
        <form ng-submit="user.addMessage()" name="messageForm">
            <input type="submit" value="click here"/>
        </form>
    </div>
</div>
<script src="<c:url value='/resources/assets/sockjs.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/assets/stomp.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/assets/angular.min.js'/>" type="text/javascript"></script>

<script src="<c:url value='/resources/assets/lodash.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/assets/scrollglue.js'/>" type="text/javascript"></script>

<script src="<c:url value='/resources/app/app.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/app/controllers.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/app/services.js'/>" type="text/javascript"></script>