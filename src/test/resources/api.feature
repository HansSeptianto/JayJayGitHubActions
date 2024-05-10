@API
Feature: Test Automation Rest API

  @valid-get-list-users
  Scenario: Test get list data normal
    Given prepare valid url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equal to 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @valid-create-new-users
  Scenario: Test create new user normal
    Given prepare valid url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_new_user_normal.json"

  @valid-delete-user
  Scenario: Test delete user normal
    Given prepare valid url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post create new user
    And hit api delete user
    Then validation status code is equal to 204

  @valid-update-user
  Scenario: Test update user normal
    Given prepare valid url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post create new user
    And hit api update user data
    Then validation status code is equal to 200
    Then validation response body update user data
    Then validation response json with JSONSchema "update_user_normal.json"