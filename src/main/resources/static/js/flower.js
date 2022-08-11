/* Alex Tetervak, Sheridan College, Ontario */

"use strict"; // use the strict mode

let link = localStorage["flower-data-link"];

$(function(){
    $.getJSON(link, displayFlowerData);
})

function displayFlowerData(flower){
    $("span.flower_name").text(flower.label);
    $("span.flower_price").html(`&dollar;${flower.price}`);
    $("img.flower_image")
        .attr("src", `images/flowers/${flower.picture.large}`)
        .attr("alt", flower.label);
    $("p.flower_info").text(flower.description);
    $("a:contains(Wikipedia)").attr("href", flower.wiki);
}
