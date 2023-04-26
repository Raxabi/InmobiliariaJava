param ($run)
$class_path = ".\includes"

function compileForClassPath () {
    javac.exe -d $class_path .\Propiedad\*.java
    javac.exe -d $class_path .\Enumeraciones\*.java
    javac.exe -d $class_path .\ClaseInmobiliaria\*.java

    #* Individual files
    javac.exe -d $class_path .\InmobiliariaControlador.java
    javac.exe -d $class_path .\InmobiliariaVista.java

    if ($run) {
        java.exe -cp $class_path .\InModelo.java
    } else {
        Write-Host "Puedes ejecutar tambien despues de la compilacion
        pasandole '-run' como argumento de la linea de comandos"
    }
}

compileForClassPath