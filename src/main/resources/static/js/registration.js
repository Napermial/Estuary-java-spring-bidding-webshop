function registerPopup() {
    document.querySelector("#login").addEventListener("click", function () {
        let cardContainer = document.createElement("div");
        cardContainer.setAttribute("class", "card");
        let cardBody = document.createElement("div");
            cardBody.setAttribute("class", "card-body");
        cardBody.appendChild(document.createTextNode("there"));
        cardContainer.appendChild(cardBody);
        document.getElementById("login").appendChild(cardContainer);
    })
}