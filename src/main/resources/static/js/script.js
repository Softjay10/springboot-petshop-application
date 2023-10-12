function showMore() {
    // Get the "more info" paragraph
    var moreInfo = document.getElementById("more-info");

    // If it is hidden, show it, otherwise hide it
    if (moreInfo.style.display === "none") {
        moreInfo.style.display = "block";
    } else {
        moreInfo.style.display = "none";
    }
}
