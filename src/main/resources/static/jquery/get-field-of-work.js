let fieldOfWorkName = $("#fieldOfWork");

$xhr = $.ajax({
   method : "GET",
   url : "http://localhost:8080/displayFieldOfWork",
   dataType :"json"
});

$xhr.done(function(data){
    for(let fieldOfWork of data){
        fieldOfWorkName.append(
                `
                <option value='${fieldOfWork.name}'>${fieldOfWork.name} </option>
                `
                );
    }
});