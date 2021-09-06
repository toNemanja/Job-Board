let registerBtn = $("#register-btn");

registerBtn.on('click', function () {

    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");

    let companyName = $("#companyName").val();
    let address = $("#address").val();
    let numberOfEmployee = $("#numberOfEmployees").val();
    let username = $("#username").val();
    let password = $("#password").val();
    console.log("employees " + numberOfEmployee);
    let employer = {
        "username": username,
        "password": password,
        "companyName": companyName,
        "address": address,
        "numberOfEmployees": numberOfEmployee
    };

    let xhr = $.ajax({
        method: "POST",
        url: "http://localhost:8080/register/saveEmployer",
        contentType: "application/json",
        data: JSON.stringify(employer),
        beforeSend: function (xhr) {
            xhr.setRequestHeader(header, token);
            console.log(token);
        },
        success() {
            alert("success");
        }, error() {
            alert("error");
        }
    });
});