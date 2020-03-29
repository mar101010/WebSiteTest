# WebSiteTest
### 2 Major bugs was found during the running test

## BUG #1 
#### Summary: 
"Add to favorites" link on advertisements list has a wrong text (text is in Latvian instead of English)

#### Description: 
Found in test #5 userSeesCorrectTextsAddingFewItems

#### Preconditions:
1. Web site https://www.ss.com/en/ (in English) is open in Chrome web browser

#### Steps:
1. Access list of individual adv. items:
Search by name or open category->subcategory untill you reach the list of items
2. Verify the text of "Add to favorites" link below

Expected: link text is "Add to favorites" (in English)
Actual: link has the text in Latvian


## BUG #2 
#### Summary: 
Adding few items to Favorites at ones user gets alret message with a wrong text (Latvian instead of English)

### Description: 
Found in test #5 userSeesCorrectTextsAddingFewItems

#### Preconditions:
1. Web site https://www.ss.com/en/ (in English) is open in Chrome web browser

#### Steps:
1. Access list of individual adv. items:
Search by name or open category->subcategory untill you reach the list of items
2. Check item(s)
3. Click on adding to favorites link
4. Verify the text of alret message

Expected: alert message text is "Advertisement added to favorites." (in English)
Actual: alert message has the text in Latvian

#### I concider the bugs as Major (not Critical).
They definitaly impact customer's impression, because the user will be confused not finding "Add to favorites" option name in English on items list. And even if he finds it, he will be confused even more seeing alert message text in unknown language. But still there is a workaround: of the user is interested in the item he will probably open it and there is that option in English with relevant alert message text.
