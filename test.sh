#!/bin/bash

echo -e "\nTests project\n"
echo -e "Connessioni\n"
curl http://localhost:8090/connessioni/connessioni

echo -e "\n\nRicette\n"
curl http://localhost:8090/ricette/ricette

echo -e "\n\nRicette seguite da Gennaro\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Gennaro

echo -e "\n\nRicette seguite da Cristano\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Cristiano

echo -e "\n\nRicette seguite da Paolo\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Paolo

echo -e "\n\nRicette seguite da Anna\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Anna

echo -e "\n\nRicette seguite da Antonino\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Antonino

echo -e "\n\nRicette seguite da Benedetta\n"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Benedetta

echo -e "\n\nTests completed!\n"