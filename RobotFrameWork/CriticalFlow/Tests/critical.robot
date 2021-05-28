*** Settings ***
Documentation           This is a test of a Pet Clinic with Robot Framework /Critical flow test
Resource                ../Resources/30_Critical_Flow_Keywords.robot
Library                 SeleniumLibrary
Test Setup              BEGIN WEB TEST
Test Teardown           END WEB TEST


*** Variables ***
${BROWSER}                            chrome
${URL}                                 http://localhost:4200
${CF_FIRST_NAME_OWNER}                 Linda                      #Mona
${CF_LAST_NAME_OWNER}                  Björklund                  #Magnus
${CF_ADDRESS_OWNER}                    Main Avenue                #Medelgatan 3
${CF_CITY_OWNER}                       43212 Gothenburg           #12345 Stockholm
${CF_TELEPHONE_OWNER}                  0876543566                 #0701010101
${CF_PET_NAME_OWNER}                   Minnie                     #Morris
${CF_BIRTH_DATE_PET_OWNER}             2020/08/21                 #2019/05/25
${CF_VISIT_DATE_PET_1_OWNER}           2021/06/29                 #2021/06/21
${CF_DESCRIPTION_VISIT_PET_1_OWNER}    general checkup            #has problems with fur


*** Test Cases ***
User can access website and add a new pet owner
    [Documentation]             This is a test for critical flow: add user, add pet, add visit
    [Tags]                      Critical_flow_Test
    GIVEN Web page is open at start page
    WHEN the user find and click on OWNER menu
    AND find ALL List of OWNERS
    AND Verify all Column names for the OWNERS List
    AND click on "Add Owner" CF
    AND add a new Owner CF     ${CF_FIRST_NAME_OWNER}       ${CF_LAST_NAME_OWNER}     ${CF_ADDRESS_OWNER}      ${CF_CITY_OWNER}    ${CF_TELEPHONE_OWNER}
    AND verify that a new owner CF is saved in Owners Page
    AND then add Pet to the owner CF             ${CF_PET_NAME_OWNER}     ${CF_BIRTH_DATE_PET_OWNER}
    AND then add a visit for newly added pet CF         ${CF_VISIT_DATE_PET_1_OWNER}       ${CF_DESCRIPTION_VISIT_PET_1_OWNER}
    AND then verify the new booked visit for pet CF
    AND then verify the owner name is display with his pet name CF




