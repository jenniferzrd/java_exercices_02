jQuery(document).ready(function($) {
	$("#tf-bgs-search-button").click(function(event) {
		if ($(this).children('.fa').hasClass('fa-search')) {
			$(this).children('.fa').removeClass('fa-search');
			$(this).children('.fa').addClass('fa-times');
			$("#search-form-container").show();
		}else{
			$(this).children('.fa').addClass('fa-search');
			$(this).children('.fa').removeClass('fa-times');
			$("#search-form-container").hide();
		}
	});
});