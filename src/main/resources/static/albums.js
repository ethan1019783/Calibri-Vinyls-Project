searchInput.addEventListener("change", (event) => {
        console.log(event.target.value);
        searchAlbums(event.target.value); 
});

const productGrid = document.getElementById("product-grid");
let allAlbums = []; 


async function loadAlbums() {
    try {
        const response = await fetch("/api/albums");
        allAlbums = await response.json(); 
        renderAlbums(allAlbums)

    } catch (error) {
        console.error("Error loading albums to grid:", error)
    }
}

function renderAlbums(albums){

    productGrid.innerHTML = "";

    albums.forEach(function(album) {
        const card = document.createElement("div"); 
        card.className = "border border-gray-200 rounded-xl p-4 shadow-sm bg-white"; 

        card.innerHTML = `
                <img 
                src="/images/${album.imageUrl}" 
                alt="${album.slug}" 
                class="w-full h-65 object-cover rounded-lg mb-4">

                <h3 class="text-lg font-semibold">${album.name}</h3>
                <p class="text-gray-500">${album.artist}</p>

                <div class="flex items-center justify-between mt-4">
                    <span class="font-bold">${'$' + album.price}</span>
                    <button class="px-4 py-2 bg-gray-200 text-black rounded-full hover:bg-gray-600">
                        ADD TO CART
                    </button>
                </div>
            `; 

             productGrid.appendChild(card);
        }); 
}

function sortAlbums(sortType){


}

function searchAlbums(searchString){
    let sortedAlbums = allAlbums.filter(album => album.name.toLowerCase().includes(searchString)); 
    productGrid.innerHTML = "";
    renderAlbums(sortedAlbums); 
}


// const javaBooks = books.filter(book => book.title.toLowerCase().includes('java'));

// const admins = users.filter(user => user.role === 'Admin');



loadAlbums(); 