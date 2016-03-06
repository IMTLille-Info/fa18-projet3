Jeu Java TL — TowerDefence
==========================

 

Groupe :
--------

-   Sebastien Vignal - tontonseb

-   Felix Ancel - fefefy

-   Yonni Tabeling - yonninout

 

Projet :
--------

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
git viewsource --ongithubhttps://github.com/TelecomLille-INFO/fa18-projet3.git
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Ce projet prend part dans notre module de projet java du groupe Info.

Nous avons choisi de partir sur un jeu simple mais efficace, le Tower Defense.

Le but du jeu est de placer des tours ayant des specs différentes afin
d’empêcher les vagues d’ennemis de parvenir à la fin du chemin qui leur est
imposé par la route définie sur l’écran. Ce type de jeu est simple à comprendre,
à prendre en main et est très additif si il est bien rodé.

 

Le développement :
------------------

Ce Projet sera entièrement codé en java et mis en ligne sur gitHub pour le suivi
du projet et l’historique des modifications.

Il sera développé avec intelliJ 15 CE de la société JetBrains. Cette IDE est
gratuit (Community edition) et cross platform.

Felix et Sebastion développeront sous Windows et Yonni sous Mac OSX.

 

Tuto — télécharger et compiler le projet :
------------------------------------------

### Pré-requis :

Il vous faudra sur votre ordinateur un moyen d’utiliser github (ligne de
commande de préférence) donc sous console pour Unix like et l’application gitHub
sous windows avec le git Bash afin de pouvoir correctement suivre le tuto.

Veillez aussi à avoir le JDK version 1.8 afin d’être sur la même configuration
que nous. (Rendez-vous [ici](<http://www.java.com/fr/download/>) si vous ne
l’avez pas).

 

### IntelliJ :

notre IDE est directement disponible sur le site de la compagnie en cliquant sur
ce [lien](<https://www.jetbrains.com/idea/download/>) en choisissant le lien en
fonction de votre OS. Suivez l’installation normalement et passez à la suite.

 

### Paramétrer gitHub avec IntelliJ :

Cliquez sur ce [lien](<https://github.com/settings/tokens>) pour ouvrir la page
de github sur la création de tokens d'authentification et connectez vous.

Sur votre droite cliquez sur generate new Token comme ci dessous :

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git13.png>)

Vous pouvez donner l’ensemble des droits sur votre compte sur ce token mais
attention de ne pas le partager par mégarde, les tokens permettent des accès
contrôlés à votre compte sans le mot de passe donc faîtes y attention.

une fois le token généré vous revenez sur la page d’avant, copiez le code
affiché à l’écran en vert

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git14.png>)


Rendez vous ensuite dans les préférences d’intelliJ dans l’onglet VCS \> GitHub
et choisissez accès par token et collez le code précédemment copié.

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-git15.png>)

Testez le et enregistrez les options, vous êtes maintenant authentifié sur
gitHub par IntelliJ ce qui permettra de commit plus simplement par la suite.

 

 

### Cloner le projet :

Nous allons cloner le projet distant depuis le repo fa18-projet3 sur github.

Lancez votre console ou git Bash (les commandes seront les mêmes quelque soit la
plateforme)

 

Déplacez vous dans le dossier où vous souhaitez importer le projet:

`cd Dev/projetJava`

Pour moi je me situe dans /Users/Yonni/Dev/projetJava mais vous pouvez choisir
le dossier que vous voulez.

Une fois dans votre dossier tapez la commande suivante :

`git clone https://github.com/TelecomLille-INFO/fa18-projet3.git`

Si la commande s’est exécutée correctement vous obtiendrai ce résultat :

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git1.png>)

Une fois ceci de fait lancer IntelliJ sur votre ordinateur et faite "new Project
with existing source"

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git2.png>)

Choisissez « build.graddle » pour l’ouverture du projet comme ci dessous :

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git3.png>)

Une pop up s’ouvre faîte attention de bien indiquer dans Gradle JVM la bonne
version du JDK, pour nous la version 1.8.

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git4.png>)

 

IntelliJ Vous demande ensuite si vous voulez ouvrir ce projet dans une autre
fenêtre ou dans celle ci, choisissez « this Window ».

A l’apparition de cette fenêtre cliquez sur « ok ».

 

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git6.png>)

 

Des messages d’alerte devraient s’afficher. Pour Maven cliquez sur Disable, nous
utilisons gradlle pour ce projet, et pour le premier message direction « Add
root » .

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git7.png>)

On cliquera simplement sur notre projet et ensuite sur le petit « + » en dessous
de la fenêtre de choix des Directory pour simplement ajouter notre projet en
tant que projet Git.

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git8.png>)

Dernière étape de configuration, le Run. Direction Run \> Edit Configurations…

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git9.png>)

Cliquez sur le « + » et créez une nouvelle « Application »

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git10.png>)

Appelez la Desktop, en main class il faut sélectionner la classe ou se situe le
main du projet c’est à dire DesktopLauncher tel que ci dessous. /!\\ Très
important : Le working directory doit bien pointer sur …/core/assets où vous
aurez le droit à de belles erreurs ;)

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git11.png>)

Finalement vous pouvez enfin lancer le projet en faisant Run \> Run ‘Desktop’

![](<https://raw.githubusercontent.com/TelecomLille-INFO/fa18-projet3/master/imgReadme/tuto-Git12.png>)

 

Enjoy ;)

 
