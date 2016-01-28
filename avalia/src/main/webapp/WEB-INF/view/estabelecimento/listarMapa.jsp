<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Simple Map</title>
<meta name="viewport" content="initial-scale=1.0">
<meta charset="utf-8">
<style>
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

#map {
	height: 100%;
}
</style>
</head>
<body>
	<div id="map"></div>
	
	<script src="https://maps.googleapis.com/maps/api/js?AIzaSyBjfJp04p7vHBfePyypFkHJep2_ruMEszY&callback=initMap"
	async defer></script>
	<jsp:include page="../fragments/footer.jsp" />
</body>
</html>