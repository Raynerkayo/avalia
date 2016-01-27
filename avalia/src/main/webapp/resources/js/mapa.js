var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
		center : {
			lat : -4.970202,
			lng : -39.019027
		},
		zoom : 15
	});
}

initMap();