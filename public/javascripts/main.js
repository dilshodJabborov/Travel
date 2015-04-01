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