const productGrid = document.getElementById("product-grid");


// load album names to console
async function loadAlbumsToConsole() {
    try {
        // 1. Ask the backend for album data
        const response = await fetch("/api/albums");

        // 2. Convert the JSON 
        // response into JavaScript data
        const albums = await response.json();

        // 3. Print the full albums array
        console.log("Albums from database:", albums);

        // 4. Loop through each album one at a time
        albums.forEach(function(album) {
            console.log("Album name:", album.name);
        });

    } catch (error) {
        // 5. If something goes wrong, show the error
        console.error("Error loading albums:", error);
    }
}
loadAlbumsToConsole();


async function loadAlbums() {
    try {
        const response = await fetch("/api/albums");
        const albums = await response.json(); 
    }
    
}

//load album names to display cards 
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