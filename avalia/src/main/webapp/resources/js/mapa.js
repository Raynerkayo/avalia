var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
		center : {
			lat : -4.968856,
			lng : -39.014950
		},
		zoom : 16
	});
}

function carregarEstabelecimentos() {
	console.log("funcao carregar");
	$getJSON('../estabelecimentos.json', function(estabelecimentos) {
		var latlngbounds = new google.maps.LatLngBounds();

		$each(estabelecimentos, function(index, estabelecimento) {
			var marker = new google.maps.Marker({
				position : new google.maps.LatLng(estabelecimento.latitude,
						estabelecimento.longitude),
				name : estabelecimento.nome,
				media : estabelecimento.media
			});
			var myOptions = {
				content : "<p>" + estabelecimento.media + "</p>",
				pixelOffset : new google.maps.Size(-150, 0)
			};

			infoBox[estabelecimento.id] = new InfoBox(myOptions);
			infoBox[estabelecimento.id].marker = marker;

			infoBox[estabelecimento.id].listener = google.maps.event
					.addListener(marker, 'click', function(e) {
						abrirInfoBox(estabelecimento.id, marker);
					});

			markers.push(marker);

			latlngbounds.extend(marker.position);

		});

		var markerCluster = new MarkerClusterer(map, markers);

		map.fitBounds(latlngbounds);

	});
}

function abrirInfoBox(id, marker) {
	if (typeof (idInfoBoxAberto) == 'number'
			&& typeof (infoBox[idInfoBoxAberto]) == 'object') {
		infoBox[idInfoBoxAberto].close();
	}

	infoBox[id].open(map, marker);
	idInfoBoxAberto = id;
}
initMap();
carregarEstabelecimentos();