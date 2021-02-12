images = ['blackwidow.jpeg','ironman.jpg','cap.jpg','thor.jpg','hulk.jpg','hawk.jpg','avengers.jpg'];


setInterval(nextImage, 500);
function nextImage() {
    i = jQuery.inArray($('#slideshow').attr('src'), images);
    if (i < images.length - 1) {
        changeImage(i + 1);
    } else {
        changeImage(0);
    }
}


//This function will change to image to whatever the variable i passes to it
function changeImage(i) {
    $('#slideshow').stop().animate({
        opacity: 0,
    }, 100, function() {
        $('#slideshow').attr('src', images[i]);
        $('.frame img').on('load',(function() {
            $('#slideshow').stop().animate({
                opacity: 1,
            }, 100)
        }))
    })
}