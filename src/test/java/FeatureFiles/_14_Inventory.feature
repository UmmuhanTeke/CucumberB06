#Scenario
#Inventory Bölümündeki Item Categories çalışmasını test ediniz
#Girişi yapıp, sonrasında silmesini yapınız.
#5 farklı değer için senaryoyu test ediniz.

Feature: Inventory Functionality Datatable and Scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Inventory Create and Delete

    And Click on the Element in LeftNav
      | inventory |
      | setup |
      | itemCategories |

    And Click on the Element in Dialog
      | addButton   |

    And User sending the keys in Dialog
      | nameInput | <name>  |

    And Click on the Element in Dialog
      | userType       |
      | userTypeSelect |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name   |
      | ummu   |
      | ummu2  |
      | ummu3  |
      | ummu4  |
      | ummu5  |

