# INSTAGNAM 

## Esecuzione 

Per eseguire questo progetto: 

Prima cosa da fare:

eseguire start-configuration-ingress.sh *solo una volta*,

verificare che l'output ottenuto contenga una stringa del tipo:

*ingress-nginx-controller..*

Ogni microservizio contiene un file .sh `start-build.sh` che fariferimento al file *Dockerfile*

Il lancio di ogni build .sh richiede il posizionamento all'interno della directory dove si trova il file script stesso.

Per effettuare il bootstrap posizionarsi nella cartella del progetto ed eseguire `Start.yaml ` 

La richiesta ad un microservizio ha la seguente struttura: `http://instagnam/ricette/*`, `http://instagnam/connessioni/*`,`http://instagnam/ricetteseguite/*`

Il file richieste.sh contiene le richiesta per l'aggiunta di una nuova ricetta, di una nuova connessione e le richieste per aggiungere una ricetta e una connessione già presenti, a quest'ultime due verrà risposto con un messaggio di errore.



