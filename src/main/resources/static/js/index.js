
$(function () {
	initTopMenu();
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
			loadPrimaryContent(url);
			return false;
		}
	});
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