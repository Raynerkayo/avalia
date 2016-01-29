<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Simple Map</title>
<jsp:include page="../fragments/htmlHead.jsp" />
<meta name="viewport" content="initial-scale=1.0">
<meta charset="utf-8">
</head>
<body>
	 <div id="floating-panel">
	 	<form action="/estabelecimento/rank">
	 		<input type="submit" value="Rank Estabelecimentos">
	 	</form>
     </div>
	<div id="map"></div>

	<script
		src="https://maps.googleapis.com/maps/api/js?AIzaSyBjfJp04p7vHBfePyypFkHJep2_ruMEszY&callback=initMap"
		async defer></script>
	<jsp:include page="../fragments/footer.jsp" />
</body>
</html>