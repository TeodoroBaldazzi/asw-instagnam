# Instagnam - Docker compose

## Build
Per eseguire la build del progetto è necessario posizionarsi nella cartella principale "asw-instagnam" ed eseguire lo script *build-all.sh*.

## Esecuzione 
Per il bootstrap dei container docker si può eseguire lo script *start-all.sh*. È stata predisposta una versione che prevede più istanze dei singoli servizi che è possibile avviare con *start-all-with-replicas.sh*. 

## Testing
Per poter osservare il fuzionamento del progetto è possibile utilizzare *test.sh* che utilizza i dati inseriti in fase di init.

## Stopping
Per il teardown è stato predisposto lo script *stop-all.sh*.
