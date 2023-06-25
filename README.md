Projekt Spring Boot z REST API

Projekt to prosty serwis REST API, zaimplementowany w Spring Boot. Został on zaprojektowany zgodnie z drugim poziomem dojrzałości modelu Richardsona, co oznacza, że wykorzystuje protokół HTTP, zasoby jako obiekty, metody HTTP do manipulacji tymi zasobami.

Serwis składa się z jednej encji i udostępnia podstawowe operacje CRUD (Create, Read, Update, Delete). Aby ułatwić uruchomienie i sprawdzenie działania projektu, skonfigurowana jest lekka baza danych in-memory h2.

Konfiguracja Hibernate
Projekt wykorzystuje Hibernate, popularną bibliotekę Java do mapowania obiektowo-relacyjnego (ORM), która ułatwia manipulację i odpytywanie baz danych. W pliku konfiguracyjnym application.properties znajduje się właściwość spring.jpa.hibernate.ddl-auto=update. Ta opcja powoduje, że Hibernate automatycznie dodaje nowe encje jako tabele do bazy danych, jeśli jeszcze nie istnieją, a istniejące schematy tabel są aktualizowane, jeśli encje zostaną zmienione. 

Architektura
Aplikacja jest zorganizowana według trójwarstwowej architektury, składającej się z warstwy prezentacji (REST API), warstwy logiki biznesowej oraz warstwy dostępu do danych. Warstwa dostępu do danych jest realizowana przez Spring Data JPA. Kod jest podzielony na klasy, zgodnie z Single Responsibility Principle. W projekcie oczywiście używałem DI, co ułatwia testowanie jednostkowe i integracyjne.

Dane logowania
Dane do logowania do konsoli bazy danych są zawarte w pliku application.properties.

Testowanie
API może być testowane za pomocą narzędzia Postman lub dowolnego innego klienta HTTP, ponieważ są udostępnione endpointy REST.
