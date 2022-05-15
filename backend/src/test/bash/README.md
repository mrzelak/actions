# testy integracyjne

* INTRO

w tym folderze znajdują się wszystkie skrypty, które obsługują zdefiniowane w springu endpointu z poziomu linii poleceń - dzięki temu testujemy jak backend obsługuje żądania HTTP.
Na początku każdego skryptu znajduje się opis, jak wywołać dany skrypt, co robi dane wywołanie, ew. todo dla każdego skryptu.
NIE NALEŻY WYWOŁYWAĆ INACZEJ SKRYPTÓW NIŻ PRZEDSTAWIONO W OPISIE BO INACZEJ KOMPUTER WYBUCHA.

no, prawie.

skrypty mają pewne zabezpieczenia na złe wywołania, ale 99,(9)% z nich została napisana w ~5h, na dodatek w godzinach nocnych, więc przy złym wywołaniu jest możliwość uzyskania złego żądania bez żadnego komunikatu błędu. 

* URUCHAMIANIE

. setup

. sin (nazwa użytkownika) (hasło)

tester

UWAGA: po kropce MUSI znajdować się spacja.

* DOKUMENTACJA

* STRUKTURA PLIKÓW

istotne są 4 foldery:

* *tests*:

W tym folderze znajdują się wykonywane testy. 
Jako wynik testu traktowane jest standardowe wyjście testu, które jest zapisywane - testy mają formę skryptów Basha, jednak przy ich wykonywaniu jest przygotowane całe środowisko, i można wygodnie korzystać ze skryptów.
Pliki mogą mieć (prawie) dowolne nazwy, aby tylko z sensem - wszystkie pliki znajdujące się w tym folderze zostaną wykonane.

* *resps*:

[skrót od resp(onse)s] W tym folderze znajdują się żądane wyniki testów - każdy z plików powinien mieć odpowiadający test o identycznej nazwie pliku w katalogu *tests*.

* *scripts*:

Większość skryptów, która odwalają potrzebną robotę. Opis działania i możliwe wywołania znajdują się w sekcji DOKUMENTACJA.

* *cache*:

Tymczasowe wyniki skryptów do plików - między innymi zapisywane są tu: dane użytkownika potrzebne do logowania, odpowiedzi serwera, itd.

Poza tymi folderami istotne są jeszcze skrypty *setup* oraz *sin*.

* *setup*:

Ten skrypt ustawia znaczącą większość środowiska potrzebną do wykonywania testów integracyjnych, ale ręcznie (z linii poleceń) - np. ustawia prawa wykonywania na skryptach,
tworzy funkcje upraszczające wywoływanie poszczególnych skryptów.

* *sin*:

[skrót od s(ign)in] Loguje danego użytkownika - ze względów technicznych nie można było nazwać ten skrypt in.

poza tym, znajdują się też mniej istotne rzeczy, takie jak:

* folder *outputs*:

otrzymane wyniki testów - sprawdzane jest, czy każdy z tych plików jest zgodny z plikiem o identycznej nazwie z folderu *resps*.

* logs:

plik, w którym zapisana jest zapisane wyjście skryptu *tester* do analizy poza działaniem testów. 

* OPIS DZIAŁANIA SKRYPTÓW

* *tester*:

* *setup*:

* *sin*:

* *get*:

* *put*:

* *post*:

* *del*:

* *up*:

* *init*:

* *ubuntu_startup*:

* *funcs*:


infosy dla mnie:

brakuje: skryptu / skryptów obsługujących podzadania, i to boli, bo trzeba pisać lwp-request'y z palca.

jak wykonuje się testy integracyjne? najprościej, czyli w ogóle albo z palca.

a teraz na poważnie. najlepiej by było, gdyby 


do tego przydałby się nowy skrypt, np 'tester' który uruchamiałby kolejne testy - DONE :D

todo: wszystkie credentials, token, można trzymać w folderze "cache". na później.

todo: wszystkie pomocnicze skrypty można trzymać w folderze "utils", "funcs" lub "scripts". na później.

edit: NAKAZ KORZYSTANIA Z FUNKCJI ZAMIAST Z ALIASÓW. dlaczego? BO FUNKCJE MOŻESZ EKSPORTOWAĆ. podczas tworzenia subshella aliasy czasem 'giną', a wyeksportowane funkcje nie.

