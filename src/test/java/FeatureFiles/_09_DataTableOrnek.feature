Feature: Datatable Örnek

  Scenario: User write
    When Write username "ummuhan"
    When Write username and password "ummuhan" and "1234"

    And Write username as Datatable
    | ismet   |
    | Ummuhan |
    | Sefa    |
    | Merve   |
    | Serkan  |

    And Write username and password as Datatable
      | ismet   | 1234 |
      | Ummuhan | 1235 |
      | Merve   | 1236 |
      | Sefa    | 1237 |
      | Serkan  | 1238 |

    #  dataProvider (TestNG için), Senaryo Outline (cucumber)
    #  görevi verilen her değer için, tüm senaryo çalışır
    #
    #  DataTable ise , sadece bir step e, çoklu parametre vermek
    #  için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar
    #  dataProvider verilen değer sayısı kadar döner
    #  dataTable bir step için çalışır ve aynı anda o parametreleri çalıştırır.