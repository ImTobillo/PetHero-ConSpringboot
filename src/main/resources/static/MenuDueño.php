<?php
require_once 'header.php'; 
require_once 'nav.php';

?>
    
    <link rel="stylesheet" property="stylesheet" href=" <?php echo CSS_PATH . 'menuDueño-Guardian.css' ?> ">

    <main>

        <h1 class="tit">Bienvenido de nuevo <?php echo $_SESSION['loggedUser']->getNombre()?></h1>

        <div class="contenedor">
            
            <div class="iguales">

                <a href=" <?php echo FRONT_ROOT . "Guardian/ShowListView" ?> " class="enlace"></a>

                <h2>Visualizar guardianes</h2>

                <p>Vea la lista de todos los guardianes disponibles.</p>

                <img class="icono" src=" <?php echo IMG_PATH . 'person.png' ?> " alt="persona">

            </div>

            <div class="iguales">

                <a href="<?php echo FRONT_ROOT . 'Reserva/ShowListPagos'?>" class="enlace"></a>

                <h2>Pagos pendientes</h2>

                <p>Clickeá acá para ver a quien le debés.</p>

                <img class="icono" src=" <?php echo IMG_PATH . 'compra.png' ?> " alt="compra">

            </div>

            <div class="iguales">

                <a href=" <?php echo FRONT_ROOT . "Mascota/ShowListView" ?> " class="enlace"></a>

                <h2>Visualizar mascotas</h2>

                <p>Mire su lista de pichichus registrados</p>

                <img class="icono" src=" <?php echo IMG_PATH . 'dog.png' ?> " alt="perro">

            </div>

            <div class="iguales">

                <a href=" <?php echo FRONT_ROOT . "Mascota/ShowAddView" ?> " class="enlace"></a>

                <h2>Agregar mascota</h2>

                <p>Aca puede agregar una nueva mascota a su lista</p>

                <img class="icono" src=" <?php echo IMG_PATH . 'pet.png' ?> " alt="perro">

            </div>

        </div>

    </main>

    <?php require_once 'footer.php' ?>