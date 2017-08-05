/*控制sidebar的点击样式*/

$(function(){
	$(".templatemo-left-nav a").each(function(){
		if($(this)[0].href==window.location){
			$(this).addClass("active");
		}
		/*alert($(this)[0].href);*/
	});
});