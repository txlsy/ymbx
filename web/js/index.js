$(function(){
    $(".a").each(function (i) {
        var id = $(this).attr("id");
        $(this).bind({
            mouseenter:function(){toggleAnimeInfo(id)},
            mouseleave:function(){toggleAnimeInfo(id)}
        });
    });
});

var toggleAnimeInfo = function animeInfo(id){
    console.info("show anime info");
    var info = $("#a-info");
    if(info.html() == ""){
        $.get("anime/info?id="+id,function(res){
            var x = $("#"+id).position();
            var top = x.top + 40;
            var left = x.left + 211;
            if(top+info.height()>$(".anime").height()) top -= info.height()-243;
            if(left+info.width()>987) left -= info.width()+225;
            info.css({top: top,left: left});
            info.html(res).show();
        });
    } else {
        info.html("").hide();
    }
};