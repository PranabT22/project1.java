<!DOCTYPE html>
<html>
<head>
    <title>Aroma Menu</title>
</head>
<body>

<h1>Aroma</h1>
<h2>Menu</h2>

<!-- Search Bar -->
<div class="container mt-3">
    <div class="row">
        <div class="col-md-8">
            <input class="form-control" id="myInput" type="text" placeholder="Search for dishes...">
        </div>

        <!-- Dropdown Menu to Filter by Food Type -->
        <div class="col-md-4">
            <label for="food">Choose the food type:</label>
            <select name="food" id="food" onchange="openJavaFile(this.value)">
                <option value="">--Select--</option>
                <option value="entree.java">Entree</option>
                <option value="hotmeal.java">Hotmeal</option>
                <option value="drinks.java">Drinks</option>
                <option value="desserts.java">Desserts</option>
            </select>
        </div>
    </div>
</div>

<!-- JavaScript to handle file opening -->
<script>
function openJavaFile(filename) {
    if (filename) {
        window.location.href = filename; 
    }
}
</script>

</body>
</html>
