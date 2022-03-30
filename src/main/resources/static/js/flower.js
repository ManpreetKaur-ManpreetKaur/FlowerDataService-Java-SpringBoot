/* Alex Tetervak, Sheridan College, Ontario */

"use strict"; // use the strict mode

let link = localStorage["flower-data-link"];

$(function(){
    $.getJSON(link, displayFlowerData);
})

function displayFlowerData(flower){
    $("span.flower_name").text(flower.label);
    $("span.flower_price").text(flower.price);
    $("img.flower_image")
        .attr("src", `images/flowers/${flower.pictures.large}`)
        .attr("alt", flower.label);
    $("p.flower_info").text(flower.text);
    $("a:contains(Wikipedia)").attr("href", flower.wiki);
}
