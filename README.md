# Instagnam - Docker compose

## Build
Per eseguire la build del progetto è necessario posizionarsi nella cartella principale "asw-instagnam" ed eseguire lo script *build-all.sh*.

## Esecuzione 
Per il bootstrap dei container docker si può eseguire lo script *start-all.sh*. È stata predisposta una versione che prevede più istanze dei singoli servizi che è possibile avviare con *start-all-with-replicas.sh*. 

## Testing
Per poter osservare il fuzionamento del progetto è possibile utilizzare i seguenti script:
- *test.sh*, utilizza i dati inseriti in fase di init;
- *puntual-requests.sh*, inserisce dei nuovi dati ed effettua delle richieste per visualizzarli.

## Stopping
Per il teardown è stato predisposto lo script *stop-all.sh*.
