# Cities menüsünün kayıt ve silme özelliğini test ediniz.

Feature: Cities Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @SmokeTest
Scenario: Create and Delete Cities

And Click on the Element in LeftNav
| setup       |
| parameters  |
| cities      |

And Click on the Element in Dialog
| addButton       |
| countrySelect   |
| countryOption   |

And User sending the keys in Dialog
| nameInput | ummuhan345 |

And Click on the Element in Dialog
| saveButton |

Then Success message should be displayed

And User delete the element from dialog
| ummuhan345  |

