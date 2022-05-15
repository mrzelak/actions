# testy integracyjne

* INTRO

w tym folderze znajdują się wszystkie skrypty, które obsługują zdefiniowane w springu endpointu z poziomu linii poleceń - dzięki temu testujemy jak backend obsługuje żądania HTTP.

Na początku każdego skryptu znajduje się opis, jak wywołać dany skrypt, co robi dane wywołanie, ew. todo dla każdego skryptu.

NIE NALEŻY WYWOŁYWAĆ INACZEJ SKRYPTÓW NIŻ PRZEDSTAWIONO W OPISIE BO INACZEJ KOMPUTER WYBUCHA.

no, prawie.

skrypty mają pewne zabezpieczenia na złe wywołania, ale 99,(9)% z nich została napisana w ~4h, na dodatek w godzinach nocnych, więc przy złym wywołaniu jest możliwość  
uzyskania złego żądania bez żadnego komunikatu błędu. 

* STRUKTURA PLIKÓW


w folderze 'tests' w osobnych plikach znajdowały się testy integracyjne, a w folderze 'resps' znajdowały się 'oczekiwane odpowiedzi' - czyli standardowe wyjście skryptów.

nazwy z folderu 'tests' muszą (a przynajmniej powinny) odpowiadać nazwom plików z folderu 'resps' - dlaczego, o tym poniżej.

infosy dla mnie:

brakuje: skryptu / skryptów obsługujących podzadania, i to boli, bo trzeba pisać lwp-request'y z palca.

jak wykonuje się testy integracyjne? najprościej, czyli w ogóle albo z palca.

a teraz na poważnie. najlepiej by było, gdyby 


do tego przydałby się nowy skrypt, np 'tester' który uruchamiałby kolejne testy - DONE :D

todo: wszystkie credentials, token, można trzymać w folderze "cache". na później.

todo: wszystkie pomocnicze skrypty można trzymać w folderze "utils", "funcs" lub "scripts". na później.

edit: NAKAZ KORZYSTANIA Z FUNKCJI ZAMIAST Z ALIASÓW. dlaczego? BO FUNKCJE MOŻESZ EKSPORTOWAĆ. podczas tworzenia subshella aliasy czasem 'giną', a wyeksportowane funkcje nie.

