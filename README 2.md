# INSTAGNAM 



## Esecuzione 

Per eseguire questo progetto: 

Ogni microservizio contiene due file .sh `start-build.sh` e   `start-container.sh` che fanno riferimento ai file *Dockerfile*,  *Deployment-nameMicroservice.yaml*, *Service-nameMicroservice.yaml*.

Eseguendo il primo script menzionato, si crea l'immagine docker a partire dal dockerfile e succesivamente viene pushata sul docker registry, questo comprende anche i comandi `gradle clean` e `gradle build`.

Attualmente è presente nello script il mio user docker hub:

modificando  *cmik/..* con *<user docker/registry>/..*. 

Quindi cambiare anche il file  *Deployment-nameMicroservices.yaml* :

modificando  *image: cmik/..* con *image: <user docker/registry>/..*

**vi prego di modificare esclusivamente ciò che riguarda gli account personali**.

Il lancio di ogni file .sh richiede il posizionamento all'interno della directory dove si trova il file script stesso.

1. lanciare tutti i file start-build.sh (se non è stato modificato codice non è necessario eseguire questo file, potete direttamente eseguire gli script per la creazione dei container, che prenderanno l'ultima immagine nel vostro o nel mio registry Docker).

2. posizionatevi sul main project directory (asw-instagnam) ed eseguite  `start-consul-container.sh ` , in una finestra del terminale dedicato, l'ultimo comando nel file .sh rimarrà appeso per tutto il tempo quindi  **non stoppatelo**.

3. se tutto è andato a buon fine troverete l'interfaccia del service discovery all'indirizzo  `http://127.0.0.1:8500`

4. posizionatevi sulla directory dell'api-gateway, quindi eseguite `start-api-gateway-container.sh ` in una finestra del terminale dedicato, quest'ultimo è disponibile all'indirizzo: `http://127.0.0.1:8080`

5. eseguite il resto dei file.sh nelle stesse modalità sopra riportate, con la differenza che non rimane appeso nulla.

Vi lascio alcuni comandi utili:

1.  verifica dei deployment,pod,service e replicaset lanciati: `kubectl  --namespace=asw-project get all `  se  in READY è riportato un 0/1 cè qualcosa che non  va e consiglio di eseguire il comando successivo:

2.  fornisce il log del pod, non che l'output di un comune java -jar, l'output di Spring: `kubectl logs --namespace=asw-project <nome del pod> ` 

3. per eliminare un pod o un deployment o un service : `kubectl delete --namespace=asw-project pod/(deployment.apps/,service/) <nome del pod, deployment, servie> `
  
4. per la descrizione di un service   `kubectl describe svc --namespace=asw-project <name service> `
  
5. per la descrizione di un deployment   `kubectl describe deployment --namespace=asw-project <name deployment> ` 
 
6. per la descrizione di un pod   `kubectl describe pod --namespace=asw-project <name pod> `

7. per tutti gli altri comandi inserire il namespace in cui stiamo lavorando ` --namespace=asw-project `.



Vi consiglio inoltre di ricordarvi di startare oltre a docker anche kubernates, lo start di docker non è strettamente legato allo start di k8s. 
Verificare che il context sia *docker desktop* e che il local cluster sia nello stato *enable*.




