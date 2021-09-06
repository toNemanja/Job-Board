let $cityName = $("#cityName");
let $xhr = $.ajax({
    method: "GET",
    url: "http://localhost:8080/displayCities",
    dataType: 'json'
});

$xhr.done(function (data) {
    for (let city of data) {
        $cityName.append(
                `
       <option value= ${city.cityName}>${city.cityName}</option>
            `
                );
    }
});




