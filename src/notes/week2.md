# String

- [dokumentáció](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)
- nem primitív típus, hanem egy referencia típus
- egy objektum áll mögötte
- deklaráció:
```java
String myString = new String("ez egy sztring");
String myOtherString = "ez egy másik sztring";
```
- hivatkozás adott indexű karakterre:
```java
myString.charAt(0) // visszaadja a sztring első karakterét
```
- immutable típus = ha egyszer létrejött a memóriában, akkor már nem tudjuk megváltoztatni az értékét; ha valamilyen műveletet végzünk rajta, annak az eredménye már egy másik sztring objektum lesz

## Metódusai
```java
substring(start, end)
```
- visszaad egy részsztringet, ami tartalmazni fogja az eredeti sztring karaktereit a start(inclusive) indextől az end(exclusive) indexig
- az end paramétert nem kötelező megadni, akkor alapértelmezetten a sztring teljes hosszát veszi

```java
toUpperCase(), toLowerCase()
```
- visszaadja az eredeti sztringet csupa nagy betűkkel, illetve kis betűkkel
```java
length()
```
- visszadja a sztring hosszát
```java
isEmpty()
```
- **true** értéket ad vissza, ha a sztring hossza 0, **false** egyébként
```java
indexOf(char c)
```
- visszaadja az adott karakter indexét a sztringben
- meg lehet adni neki sztringet is paraméterként
- ha az adott karakter/sztring nem található az eredeti sztringben, akkor -1 értéket fog visszaadni
```java
contains()
```
- megnézi, hogy a megadott paraméter benne van-e részsztringként egy sztringben
- visszatérési értéke **boolean** típusú
```java
replace(mit, mivel)
```
- a **mit** részsztring összes előfordulását helyettesíti a **mivel** részsztring értékével
```java
strip()
```
- eltávolítja a sztring elejéről és a végéről a whitespace karaktereket(space, tab, új sor karakter)
```java
toCharArray()
```
- az eredeti sztringet egy karaktertömbként adja vissza
- for ciklusos bejárásnál használatos például

## Formázás
- System.out-nak van egy olyan metódusa, hogy printf(), aminek format sztringeket lehet megadni

| Formátumkód  | Típus          |
| -----------  | -----------    |
| %d           | integer        |
| %c           | karakter       |
| %f           | floating point |
| %s           | sztring        |
| %b           | boolean        |
| %n           | új sor         |

- példa a használatra:
```java
int age = 21;
String name = "Anett";
String major = "Computer Science";

System.out.printf("Hello, my name is %s, I'm %d years old and I study %s", name, age, major);
```



