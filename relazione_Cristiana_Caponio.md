**PROGETTO API NEW GENERATION SENSORS S.R.L.** 

**CAPONIO CRISTIANA**

**Tasks**

- scaricare un database document oriented;
- caricare al suo interno i dati inoltrati in formato json;
- sviluppare una API che permetta di prelevare i dati dal DB e realizzare una query relativa al campo “town” del json “raw\_address”;
- testare il funzionamento dell’API tramite Postman.

**Strumenti utilizzati**

- MongoDb versione 4.4.29;
- Mongo Express;
- Docker desktop;
- Java versione 21.0.1;
- Spring versione 3.2.4;
- Eclipse IDE;
- Postman;
- Git.

**Procedimento**

`     `Al fine di realizzare la succitata API si è deciso di far ricorso alla versione più recente di MongoDb su cloud ed a Spring Initializr per creare un progetto dotato della dependency necessaria alla interazione con il suddetto database. 

`     `In fase di avvio di Spring, tuttavia, è stato appurato che il framework non supportava le versioni del database dalla 5.0 alle più recenti, di talché si è provveduto tramite la piattaforma Docker Hub a scaricare l’image della versione 4.4.29 di MongoDb ed a creare i container “mongo” e “mongo-express” che sono stati, altresì, configurati all’interno di un file docker-compose.yml.

`     `Verificata la corretta interazione tra Spring ed il database, è stato importato su Mongo Express il file contenente i dati in formato json e, successivamente, è stata avviata l’implementazione del progetto su Eclipse tramite il pattern MVC. A tal fine sono stati creati i rispettivi packages:

- **ìt.newGenerationSensors.projectapi.entity**

  in cui è stata realizzata la classe ProjectEntity caratterizzata da attributi private in grado di richiamare i dati contenuti nel database attraverso l’utilizzo del medesimo nome o dell’annotazione @Field (“”). La funzione di tale classe consiste nella mappatura mediante le annotations @Document(nome\_database/tabella) e @Id di un database al fine di operare su di esso tramite le funzioni di Java e Spring. Essendo i dati inseriti dall’interno di json tra loro concatenati, è stato necessario creare più entities ed istanziarle all’interno della classe ProjectEntity per riprodurre fedelmente il contenuto del database su MongoDb;

- **it.newGenerationSensors.projectapi.repository**

  all’interno di questo package è stata creata l’interfaccia ProjectRepository che estende MongoRepository, nella quale sono state inserite due query che effettuano una ricerca tramite il dato “town”.  

  Public List<ProjectEntity> findByRawAddress\_Town(String town)  richiede l’inserimento dell’intero dato “town” costituito da una stringa, mentre public List<ProjectEntity> findByRawAddress\_TownLike(String townLike)  consente di trovare il dato anche attraverso l’inserimento di una o più lettere che compongono la stringa ricercata;

- **it.newGenerationSensors.projectapi.ctr**

  al suo interno è stata creata la classe ProjectCtr la cui funzione consiste nel raccogliere le richieste e le azioni che possono essere effettuate nel database. All’interno di tale classe è stato dapprima creato un metodo “findAllData” per consentire l’accesso all’intero contenuto del database e, successivamente, sono state implementate le query di ricerca findByRawAddress\_Town e findByRawAddress\_TownLike.

`     `Su Postman sono stati inseriti i seguenti url per testare il funzionamento dei metodi e la corretta mappatura dei dati:

localhost:8080/ProjectCtr/findByTownLike?town=Ba

localhost:8080/ProjectCtr/findByTown?town=Impruneta

localhost:8080/ProjectCtr/findAllData
**
`     `I test effettuati hanno avuto esito positivo, pertanto l’API risulta funzionante. Sarebbe stato possibile implementare il pattern MVC attraverso l’utilizzo di classi Dto, Mapper e Service. Tuttavia, la inidoneità di Spring a supportare la versione più recente di MongoDb presente su cloud ha comportato la ricerca di soluzioni alternative ed una fase di studio più approfondita sul suddetto database e sul funzionamento di Docker, di talché al fine di rispettare i tempi di consegna si è preferito dare priorità al corretto funzionamento dell’API. 



