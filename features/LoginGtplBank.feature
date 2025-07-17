Feature: GTPL Bank Login

Scenario Outline: Login to GTPL Bank

Given I am on GTPL bank Login page
When I enter '<UserName>' and '<Password>'

Then I Logged In To GTPL Bank Page

Examples:
|UserName|Password|
|mngr627617|enYqasA|
