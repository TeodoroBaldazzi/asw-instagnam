# INSTAGNAM 

## Esecuzione 

Per eseguire questo progetto: 

Prima cosa da fare:

eseguire start-configuration-ingress.sh *solo una volta*,

verificare che l'output ottenuto contenga una stringa del tipo:

*ingress-nginx-controller..*

Ogni microservizio contiene due file .sh `start-build.sh` e  `start-container.sh` che fanno riferimento ai file *Dockerfile*,  *Deployment-nameMicroservice.yaml*, *Service-nameMicroservice.yaml*.

Il lancio di ogni build .sh richiede il posizionamento all'interno della directory dove si trova il file script stesso.

Per effettuare il bootstrap posizionarsi nella cartella del progetto ed eseguire `start-all-container.sh ` 

La richiesta ad un microservizio ha la seguente struttura: `http://instagnam/ricette/*`, `http://instagnam/connessioni/*`,`http://instagnam/ricetteseguite/*`





