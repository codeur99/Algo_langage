const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Demande à l'utilisateur de saisir un nombre
rl.question('Veuillez saisir un nombre: ', (nombre) => {
  // Calcule le reste de la division par 2
  const reste = nombre % 2;

  // Vérifie si le reste est égal à 0
  if (reste === 0) {
    console.log("ce nombre pair");
  } else {
    console.log("ce nombre impair");
  }

  // Ferme l'interface readline
  rl.close();
});
