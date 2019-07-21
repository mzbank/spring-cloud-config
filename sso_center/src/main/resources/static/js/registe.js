var registe = function () {

    var param = {}
    param.username = $("#username").val();
    param.passwrod = $("#password").val();
    alert(param.username);
    alert(param.passwrod);
    $.post("userservice",param);

}