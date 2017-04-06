
var locationHash = null;

$(function () {
	initTopMenu();

	initIndexPage();
});

function initTopMenu() {
	$('.ui.menu .ui.dropdown').dropdown({
		on: 'hover'
	});
	$('.ui.menu a.item').on('click', function () {
		$(this).addClass('active').siblings().removeClass('active');
		var url = $(this).attr("href");
		if (null != url && 0 < url.trim().length && "index.html" != url) {
			console.log("Load resource", url);
			// loadPrimaryContent(url);
			laotse.go(url);
			return false;
		}
	});
}

function initIndexPage() {
	locationHash = window.location.hash;
	console.log(locationHash);
	if (laotse.isNotEmpty(locationHash)) {
		var index = locationHash.indexOf("#page=");
		if (index == 0) {
			var page = locationHash.substring(index + "#page=".length);
			console.log(page);
			laotse.go(page);
			return;
		}
		index = locationHash.indexOf("#url=");
		if (index == 0) {
			var url = locationHash.substring(index + "#url=".length);
			console.log(url);
			// TODO
			return;
		}
	}
	loadPrimaryContent("dashboard/dashboard.html")
}

function loadPrimaryContent(url) {
	$.ajax({
		url: url,
		async: false,
		success: function (html) {
			$("#primary-content").empty().html(html);
		}
	});
}

function signout() {
}

if (typeof(laotse) == "undefined") {
	laotse = {};
}

laotse.go = function(url) {
	if (laotse.isEmpty(url)) {
		return;
	}
	var index = url.indexOf(".html");
	if (index > 0) {
		loadPrimaryContent(url.substring(0, index + ".html".length));
		window.location.hash = "page=" + url;
		return;
	} else {
		// TODO
	}
}