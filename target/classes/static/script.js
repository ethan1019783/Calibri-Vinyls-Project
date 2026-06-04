

helloButton?.addEventListener("click", () => {
    message.textContent = "Hello from JavaScript inside your Spring Boot website!";
});

const products = [
    {
        name: "Blonde",
        artist: "Frank Ocean",
        price: 40,
        image: "/images/blonde-vinyl.jpg"
    },
    {
        name: "Thriller",
        artist: "Michael Jackson",
        price: 35,
        image: "/images/thriller-vinyl.jpg"
    },
    {
        name: "Abbey Road",
        artist: "The Beatles",
        price: 30,
        image: "/images/abbey-road-vinyl.jpg"
    }
];

const productGrid = document.getElementById("product-grid");

products.forEach(product => {
    const card = document.createElement("div");

    card.className = "border border-gray-200 rounded-xl p-4 shadow-sm bg-white"; // creates the card blank 

    card.innerHTML = `   
        <img 
            src="${product.image}" 
            alt="${product.name}" 
            class="w-full h-56 object-cover rounded-lg mb-4"
        >

        <h3 class="text-lg font-semibold">${product.name}</h3>
        <p class="text-gray-500">${product.artist}</p>

        <div class="flex items-center justify-between mt-4">
            <span class="font-bold">$${product.price}</span>
            <button class="px-4 py-2 bg-indigo-500 text-white rounded-full hover:bg-indigo-600">
                Add
            </button>
        </div>
    `;

    productGrid.appendChild(card);
});

fetch("/api/albums")
    .then(response => response.json())
    .then(albums => {
        console.log(albums);

        albums.forEach(album => {
            console.log(album.title);
        });
    })
    .catch(error => {
        console.error("Error loading albums:", error);
    });