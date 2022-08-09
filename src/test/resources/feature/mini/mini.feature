Feature: 检查是否正常进入mini


  @FunctionalTest

  Scenario: 检查是否正常进入mini 可点击关闭按钮
    Given Go to mini home
    When  I find mini logo
    And   Click the close
    Then  Wait the current result

  Scenario: 检查是否正常进入mini
    Given Go to mini home
    When  I find mini logo
    And   Click the close
    Then  Wait the current result
