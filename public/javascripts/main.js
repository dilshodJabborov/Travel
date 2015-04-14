/**
 * Created by Dilshod on 30.03.2015.
 */
function changeLoginUp(loginUp) {
    if(document.getElementById(loginUp).style.display == 'none' || document.getElementById(loginUp).style.display == '') {
        document.getElementById(loginUp).style.display = 'block';
    } else {
        document.getElementById(loginUp).style.display = 'none';
    }
}
function closeVideo(WatchHowItWorks,videoDiv) {
    document.getElementById(videoDiv).style.display = 'none';
    document.getElementById(WatchHowItWorks).src='';
    document.getElementById(WatchHowItWorks).src='//www.youtube.com/embed/yP2BUxyyHYw?rel=0&amp;amp;&amp; autoplay=0';
}
