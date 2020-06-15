echo -e "\n\nAGGIUNGENDO CONNESSIONI..."

curl -H "Content-Type: application/json" -d '{"follower": "Marco", "followed": "Catia"}' -X POST http://localhost:8090/connessioni/connessioni

curl -H "Content-Type: application/json" -d '{"follower": "Catia", "followed": "Marco"}' -X POST http://localhost:8090/connessioni/connessioni

curl -H "Content-Type: application/json" -d '{"follower": "Francesco", "followed": "Catia"}' -X POST http://localhost:8090/connessioni/connessioni



echo -e "\n\nAGGIUNGENDO RICETTE..."

curl -H "Content-Type: application/json" -d '{"autore": "Marco", "titolo": "Roast beef", "preparazione": "Lunga"}' -X POST http://localhost:8090/ricette/ricette

curl -H "Content-Type: application/json" -d '{"autore": "Marco", "titolo": "Lasagna", "preparazione": "Media"}' -X POST http://localhost:8090/ricette/ricette

curl -H "Content-Type: application/json" -d '{"autore": "Catia", "titolo": "Pizza", "preparazione": "Lunga"}' -X POST http://localhost:8090/ricette/ricette

curl -H "Content-Type: application/json" -d '{"autore": "Francesco", "titolo": "Pasta", "preparazione": "Breve"}' -X POST http://localhost:8090/ricette/ricette



echo -e "\n\nCONNESSIONI:"

curl http://localhost:8090/connessioni/connessioni



echo -e "\n\nRICETTE:"

curl http://localhost:8090/ricette/ricette



echo -e "\n\nRICETTE SEGUITE:"

echo -e "\n\nda Francesco:"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Francesco

echo -e "\n\nda Marco:"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Marco

echo -e "\n\nda Catia:"
curl http://localhost:8090/ricette-seguite/ricetteseguite/Catia

echo -e "\n\nTests completed!\n"