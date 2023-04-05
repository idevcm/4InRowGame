1. English manual
2. Manual en español

# 4 IN A ROW

This program is a classic multiplayer game designed to be played on a PC console.

It's Connect Four, a game in which two players compete to place 4 same-colored chips consecutively, either vertically, horizontally, or diagonally.

In this game, even though it's played on a console, we can enjoy sound and color effects for each of the chips of the two players.

## Repository contents

This repository includes:

- An ***SRC*** folder where all the program content is stored.

	-Additionally, a .txt file is included that collects the necessary commands for compiling and executing the program in a simple way, as doing it in another way could result in some kind of error.

- A ***class*** folder where the compiled program is stored and ready to run.

- A ***JavaDoc*** folder with all the necessary documentation.

- A folder with the ***sound files*** necessary for the program to run.

- A ***README*** file with instructions in both English and Spanish.

## Requirements

To run the program, you must have the Java JVM installed and updated to the latest version. To check if it is installed or updated, open your computer's terminal and type the following command: ***java -version***

![image](https://user-images.githubusercontent.com/110684532/230031245-1ac3d750-d12f-4071-92cc-4a214a69c727.png)

If the command is not recognized or your JVM is under 18 version, it means that you do not have the JVM installed on your computer or not updated. To install the latest version, please follow the link below:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

Here is the direct download link for Windows: https://download.oracle.com/java/20/latest/jdk-20_windows-x64_bin.exe

## Execution

Once we have downloaded the repository, we must navigate to the /src folder of the project.

![image](https://user-images.githubusercontent.com/110684532/229853164-f0c6480a-d5e5-4ae1-910f-c4599dd65f26.png)

Once there, we will right-click anywhere in the folder and open the console. We can also access it using the cd command and then entering the absolute path of the SRC folder.

![image](https://user-images.githubusercontent.com/110684532/229859598-2456d266-0b7b-4b0b-866c-f2c610aa3587.png)

Once we are in the path, we will enter the command that can be found in the text file: ***java -classpath ../class Start.Main.***

![image](https://user-images.githubusercontent.com/110684532/229859947-e8086052-7543-4b56-8b81-1adbf192e2e6.png)

We press the ***Enter*** button and the game will run.

![image](https://user-images.githubusercontent.com/110684532/229860231-af2476ab-49d7-4072-9fec-c07bad3e6bbf.png)

## How to Play

First, the game will ask for a name for player 1. You can enter any alphanumeric character, such as 1234, abcd, $%&¿¿)()... as shown below:

![image](https://user-images.githubusercontent.com/110684532/229860660-328a1dd4-ac34-4365-b806-90b5656238ce.png)

To proceed, we must press the ***Enter*** key after entering our name.

Next, the game will ask for a name for player 2. Both players have the same restrictions when it comes to entering a valid name. Compound names can also be used, as shown below:

![image](https://user-images.githubusercontent.com/110684532/229861394-2e1f2e7b-c8bf-4c91-bfe0-e6582f8c4cd7.png)

Once we have entered both names, the game board will be displayed and we will be prompted to enter a number from 1 to 7:

![image](https://user-images.githubusercontent.com/110684532/229861951-906db52a-2c92-42be-b0c3-efa09dfd4bfe.png)

We need to enter a number from 1 to 7 and press the ***Enter*** key. Once we do this, the position of our token will be shown and it will become the next player's turn:

![image](https://user-images.githubusercontent.com/110684532/229862252-baff5d6c-11b6-43a0-b066-7d43295c9e53.png)

No data other than numbers from 1 to 7 will be accepted, otherwise, an error message will appear and a valid data will be requested again.

Once one of the participants wins, a message will appear that I wanted to dedicate to all those who have spent their time testing this humble student's game.

In case we want to stop the game, we can do it through the key combination ***CTRL+C***

## Compiling changes

In case you want to modify the code and compile the program without any further complications, go back to the **SRC** folder where the program and the previously mentioned .txt file are located.

There, you will find the command to compile the program and run it without having to move between folders.

The command to compile the program is as follows:

***javac -d ../class Start/Main.java Execution/ExecutionProgram.java ***

![image](https://user-images.githubusercontent.com/110684532/229864045-6f540435-60a7-4964-8ca3-7d43ae74d00b.png)

----------------------------------------------------------------------------------------------

# 4 EN RAYA

Este programa se trata de un juego clásico multijugador diseñado para se jugado en una consola de pc. 

Se trata del 4 en raya, un juego en el que 2 personas compiten por colocar 4 fichas del mismo color de forma consecutiva, ya sea en vertical, horizontal o diagonalmente.

En este juego, a pesar de jugarse en consola, podremos disfrutar de efectos de sonido y color para cada una de las fichas de los 2 participantes. 

![image](https://user-images.githubusercontent.com/110684532/229859096-856ea19c-9f77-47ff-bb95-0b11f3c83117.png)

## Contenido del repositorio

Este repositorio cuenta con:
- Una carpeta **SRC** donde se almacena todo el contenido del programa.

	- Adicionalmente se incluye un archivo .txt donde se recogen los comandos necesarios para la compilación y ejecución del programa de forma sencilla, ya que de realizarlo de otro modo podría dar algún tipo de error.

- Una carpeta ***class*** donde se almacena el programa compilado y listo para ejecutar.
- Una carpeta ***JavaDoc*** con toda la documentación necesaria. 
- Una carpeta con los archivos de sonido necesarios para que el programa funcione
- Un archivo ***README*** con las instrucciones, tanto en inglés como en español.

## Requisitos

Para ejecutar el programa, debes tener instalado la JVM de java o disponer de sus últimas versiones, para comprobar si lo tienes instalado o actualizado, abre la terminal de tu pc y escribe el siguiente comando: ***java -version***

![image](https://user-images.githubusercontent.com/110684532/230031245-1ac3d750-d12f-4071-92cc-4a214a69c727.png)

En el caso de que no reconozca el comando o la versión de tu JVM sea inferior a la 18, quiere decir que no tenemos la JVM instalada en nuestro pc o que bien disponemos de una desactualizada, para arreglar esto siga el siguiente enlace:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

Enlace directo de descarga para Windows: https://download.oracle.com/java/20/latest/jdk-20_windows-x64_bin.exe

## Ejecución

Una vez nos hayamos descargado el repositorio, debemos situarnos en la carpeta /src del proyecto.

![image](https://user-images.githubusercontent.com/110684532/229853164-f0c6480a-d5e5-4ae1-910f-c4599dd65f26.png)

Una vez allí, haremos click derecho sobre cualquier punto de la carpeta y abriremos la consola. También podremos acceder a ella con el comando ***cd*** y poniendo a continuación la ruta absoluta de la carpeta ***SRC***.

![image](https://user-images.githubusercontent.com/110684532/229859598-2456d266-0b7b-4b0b-866c-f2c610aa3587.png)

Una vez nos encontremos en la ruta, introduciremos el comando que podemos encontrar en el archivo de texto: ***java -classpath ../class Start.Main***

![image](https://user-images.githubusercontent.com/110684532/229859947-e8086052-7543-4b56-8b81-1adbf192e2e6.png)

Pulsamos el botón ***Enter*** y el juego se ejecutará.

![image](https://user-images.githubusercontent.com/110684532/229860231-af2476ab-49d7-4072-9fec-c07bad3e6bbf.png)

## Cómo Jugar

En primer lugar nos pedirá un nombre para el jugador 1, podemos introducir cualquier caracter alfanumérico, 1234, abcd, $%&¿¿)()... como se muestra a continuación:

![image](https://user-images.githubusercontent.com/110684532/229860660-328a1dd4-ac34-4365-b806-90b5656238ce.png)

Para que el programa avance deberemos pulsar la tecla ***Enter*** tras introducir nuestro nombre.

A continuación nos pedirá un nombre para el jugador 2, ambos jugadores tienen las mismas restricciones a la hora de introducir un nombre válido. También se pueden emplear nombres compuestos, como se muestra a continuación:

![image](https://user-images.githubusercontent.com/110684532/229861394-2e1f2e7b-c8bf-4c91-bfe0-e6582f8c4cd7.png)

Una vez hayamos introducido ambos nombres, se nos desplegará el tablero y nos pedirá que introduzcamos un número del 1 al 7:

![image](https://user-images.githubusercontent.com/110684532/229861951-906db52a-2c92-42be-b0c3-efa09dfd4bfe.png)

Deberemos introducir un número del 1 al 7 y presionar la tecla ***Enter***. Una vez hayamos hecho esto, se mostrará la posición de nuestra ficha y pasará a ser turno del siguiente jugador:

![image](https://user-images.githubusercontent.com/110684532/229862252-baff5d6c-11b6-43a0-b066-7d43295c9e53.png)

No se admitirán otros datos que no sean números del 1 al 7, de lo contrario, aparecerá un mensaje de error y volverá a pedir un dato válido.

Una vez que uno de los participantes gane, aparecerá un mensaje que he querido dedicar a todas aquellas personas que hayan dedicado su tiempo a probar el juego de este humilde estudiante. 

En caso que se desee detener el juego, podemos hacerlo a través del la combinación de teclas ***CTRL+C***

## Compilar los cambios 

En caso que quieras cambiar el código y desees compilar el programa sin mayor complicación, dirígete nuevamente a la carpeta **SRC**, donde se encuentra el programa y el archivo .txt que se mencionó antes. 

Allí tendrás el comando para que, desde la misma carpeta ***SRC*** puedas compilar el programa y ejecutarlo sin moverte entre carpetas. 

El comando para compilar el programa es el siguiente: 

***javac -d ../class Start/Main.java Execution/ExecutionProgram.java ***

![image](https://user-images.githubusercontent.com/110684532/229864045-6f540435-60a7-4964-8ca3-7d43ae74d00b.png)



