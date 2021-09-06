let postJobBtn = $("#post-job-btn");

postJobBtn.on('click', function () {

    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");

    let fielfOfWork = $("#fieldOfWork").val();
    let jobName = $("#job-name").val();
    let jobDescription = $("#job-description").val();
    let city = $("#cityName").val();
    let dateOfExpire = $("#job-expiration").val();
    let candiateDescription = $("#candiate-desc").val();
    let employer_id = $("#employer_Id").val();


    let job = {
        "name": jobName,
        "description": jobDescription,
        "dateOfExpire": dateOfExpire,
        "employeeDescription": candiateDescription,
        "employer": {
              id : employer_id
        }
    };

    let xhr = $.ajax({
        method: "POST",
        url: "http://localhost:8080/job/save",
        contentType: "application/json",
        data: JSON.stringify(job),
        beforeSend: function (xhr) {
            xhr.setRequestHeader(header, token);
        },
        success: function () {
            alert('success');
        },
        error: function () {
            alert('error');
        }
    });
});

