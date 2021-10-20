# Témák
 *különböző java kiadások, többdimenziós tömbök, refactoring, clean code, debugging, öröklődés, assert-ek használata*
 
## 1. Java kiadások

####Java SE - Standard Edition: 

- amit mi használunk

####Java EE - Enterprise Edition:

- a Java SE-re alapul
- nagyméretű vállalati szoftverek fejlsztésére találták ki
- használata kiváltható light-weight keretrendszerekkel, mint például a Spring

####Java ME - Micro Edition

- általában kisebb eszökzökre, például mobilokra való fejlesztéshez használják

#### Java verziók

- Főbb kiadások félévente
- Frissítések negyedévente (általában bugfixeket tartalmaznak, a verziószám ilyenkor nem nő)
- LTS: Long Term Support, hosszú távon támogatott kiadások három évente
- legutolsó LTS: Java 17 2021. szeptember
- azelőtt: Java 11

## 2. Többdimenziós tömbök
- Arrays.deepToString() a kiíratáshoz
- példakód az examples mappában

## 3. Refactoring, clean code
*“Any fool can write code that a computer can understand. Good programmers write code that humans can understand.” - Martin Fowler*

- Refactoring = a kód átszervezése úgy, hogy a program működése nem változik, de a maga a kód átláthatóbbá válik

#### Mitől lesz "tiszta" egy kód?
- beszédes változó és metódusnevek, amelyek nem félrevezetőek
- rövid metódusok (max. 15-20 sor)
- változónévben ne legyen Hungarian Notation (utal arra, hogy milyen típusú a változó, pl String strName)
- nincsenek felesleges kommentek
- DRY
- szépen, egységesen formázott (IntelliJ: **Ctrl+Alt+L**, VSCode: **Ctrl+Shift+I**)

##### Java elnevezési konvenciók:

| Elem | Betűzés | Jellegzetesség | Példa |
| --- | --- | --- | --- |
| Osztály név | Nagy kezdőbetűs "camel case" | Főnév | OfficeBuilding|
| Interfész név | Ugyanaz mint az Osztály | Jellemzően melléknév "able" vagy "ible" végződéssel | Paintable |
| Metódus név | Kis kezdőbetűs "camel case" | Ige | prepare |
| Példány és Osztályszintű változó | Ugyanaz mint a metódus | Főnév | color |
| Paraméter és lokális változó | Ugyanaz mint a változó | Főnév | colorCode|
| Generikus típus paraméter | Egy nagybetű | Jellemzően egy nagy T betű | T |
| Konstans | Csupa nagybetű | Több szó aláhúzás (_) karakterrel elválasztva | BLUE_CODE |
| Enumeráció | Ugyanaz mint az Osztály | Főnév | enum WorkNeeded {PAINT_ONLY, RENOVATION_ONLY, PAINT_AND_RENOVATION} |
| Csomag | Csupa kisbetű | A fordított domain neve az adott cégnek | hu.unideb.inf |

## 4. Öröklődés
- az OOP egyik alapelve
- szoros kapcsolatot definiál két osztály között
- **extends** kulcsszó
- egy szülő osztálytól leöröklődik minden **public** és **protected** attribútum és metódus
- **private** mezők és metódusok nem öröklődnek
- **final** osztály nem kiterjeszthető
- egy osztály csak egyetlen másik osztályt terjeszthet ki
- diamond probléma?

## 5. Unit Testing

- unit = egység
- az egység általában egyetlen metódust jelent, tehát minden metódushoz legalább egy egségtesztet kell írni
- legelterjedtebb keretrendszer Unit Testek írásához: JUnit
- keretrendszer nélkül is megoldható: beépített Java **assert**
- működése:
```java
assert logikaiFeltétel
```
- amennyiben a logikai feltétel igaznak érékelődik ki, az assert hiba nélkül fut
- amennyiben a logikai feltétel hamisnak értékelődik ki egy ún. **AssertionError** dobódik, ami a kivételeknek egy rokona
- tulajdonképpen nem kivétel (kivételekről később), hanme egy Error, amit nem kell elkapni és kezelni
- az Error általában olyan hibát jelez, ami után már nem lehet visszaállítani az alkalmazást egy működő állapotba
- így ha AssertionError dobódik, akkor nem ment át a tesztünk.

### Given-When-Then

- egységteszteléshez használatos struktúrálási forma
- *Given*: mi az ami *adott* a teszthez (általában a tesztelt objektum)
- *When*: *amikor* valami történik a tesztalannyal (általában meghívjuk egy metódusát)
- *Then*: *akkor*, hogyan fog reagálni az alany, meg fog-e ez felelni az elvárt viselkedéssel?

