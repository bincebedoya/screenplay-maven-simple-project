Feature: Wikipedia Searcher
As a Wikipedia user
I want to search
To learn something new 
 
Scenario Outline: Search a single word 
Given That I am in wikipedia home page
When I search the word <wordToSearch>
Then I hope to see the title <wordToSearch>

Examples:
| wordToSearch|
| "Milk" |
| "Egg" |