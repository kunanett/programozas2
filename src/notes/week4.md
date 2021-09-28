# Negyedik hét

---
## 1. Foreach ciklus

- alakja: for(int **<ciklusváltozó>** : **<tömb>**){}
- példa

```java
    int[]array={1,2,3,4,5};

        for(int element:array){
        System.out.println(element);
        }
```

- a tömb elemeihez mi nem indexeken keresztül férünk hozzá
- a foreach bejárja a tömb összes elemét

---

## 2. Metódustúlterhelés

- egy osztályon belül lehet két ugyanolyan nevű metódus, hogyha eltér a formális paraméterlistájuk
- példa:

```java
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
```
- a formális paraméterek neve nem számít, hanem a csak a paraméterek típusai és számossága
- a különböző visszatérési érték sem
- példa:
```java
    int add(int a, int b) {
        return a + b;
    }

    double add(int number1, int number2) {
        return number1 + number2;
    }
```
- a fenti eset nem fog lefordulni, mivel nem egyértelmű, hogy metódushívás esetén melyik hívódjon a kettő közül

### 2.1. Polimorfizmus
- a nevéből eredően többféle viselkedési formát jelent

#### 2.1.1. Futásidejű polimorfizmus (Runtime polymorphism)
- metódusfelülírással érhető el (method overriding)
- azért nevezzük futásidejűnek, mert runtime dől el, hogy a felülírt metódus közül melyik hívódik


#### 2.1.2 Fordításidejű polimorfizmus (Compile-time polymorphism)
- metódustúlterhelés (method overloading)
- azért nevezzük fordításidejűnek, mivel már fordításkor lehet tudni, hogy melyik metódus fog hívódni
- pl: a legelső példában ha az add metódust két int értékkel hívjuk, akkor egyértelműen meg lehet mondani, hogy az első add lesz meghívva, még mielőtt lefuttatjuk a programot

## 3. Statikus metódus
- emlékezzünk vissza a statikus változókra
- egy osztály statikus metódusát akkor is hívhatjuk, hogyha nincs belőle példány
- példányon keresztül nem lehet hívni, csak osztályon keresztül

## 4. Dinamikus tömb
- [dokumentáció](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- ArrayList-nek hívjuk
- A java Collections Framework része
- deklaráció és értékadás példa:
```java
        List<Integer> numbers = new ArrayList<>();
```
- érdemes sima List-ként deklarálni, (erről később)
- hasznos metódusok: add(), addAll(), clear(), size(), isEmpty(), get(), stb.
- gyémánt operátor között kell megadni, hogy a tömb milyen típusú objektumokat fog tartalmazni: **<>**
- ArrayList-be csakis objektumokat pakolhatunk, ezért kellett a nagybetűs Integer típust megadni a kacsacsőrök között
- [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) utility osztály tartalmaz sok hasznos metódust, pl sort()