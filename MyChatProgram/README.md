COSC 310 
Assignment #3 README file
Kento Sera 55133102
============

Instruction:

	The perpuse of this progam is to let the user have a experience of a first date conversation, allowing user to input questions and phrases that the system will answer with specified answers. 

	This anser response is done by the computer having a pre-entered set of keywords and response in a database which are related to each other. When the user enters a sentence or phrase, the computer searches for a keyword contained inside the user's input. The responds with the response which is connected with this keyword.

	The database also containes a secondary-tag which allows diffrent responses to be done with same keywords, but diffrent response because of other tags which is contained with this sentence.

Run through:


Welcome to Chat. Please enter a digit to choose the computer to be a male or female: Male = 1, Female = 2 
 Enter Here:
1
hello there
hi
whats your name?
My name is Johnny Nash, what's your name?
my name is Kent Sara
That's a sweet name, hope we have fun today.
I'm sure it's going to be a good day
awesome
do you want to go somewhere?
Lets go get something to eat.
what food do you like?
steak
me too, lets go
Ha ha ha, I'm happy we have something in common.
can you tell me a joke while we go?
Why are bananas never lonely? Because they hang around in bunches.
btw, how are you?
Could be better
you have a nice smile
how sweet.
do you have a pet?
I own a little turtle. It's very relaxing actually.
I might kill that
no.
sorry
Don't worry about it, just be careful next time.
what is your hobby
I enjoy riding my motorcycle, going around the countryside on my bike really feels good.
me too
Ha ha ha, I'm happy we have something in common.
how about movie you like?
I really don't watch that much, but I did enjoy Pacific Rim, that was awesome.
my favorite movie is 300
Haven't watched that yet, it will be great if we can watch it somewhere.
do you own a car?
I can drive for you, anywhere you want to go?
no
We're in a disagreement I guess.
I'm sorry
Don't worry about it, just be careful next time.
do you like riding bikes?
Yup, been fiddling around and riding them all my life. Might call myself a bit of a greeser. 
how old are you?
I'm 21, turning 22 in a few months.
do you like me?
You are my type, but lets not rush.
i like you
Why thank you, I'm having a great  time as well!
what book do you like?
I don't read books, but I do like comics. And don't call me a nerd, Archy's awesome
me too
Ha ha ha, I'm happy we have something in common.
you look nice
Well I've been working out, 4 times in the gym every week.
I think I'm in love with you
That's not something you say on a first date.
that's mean
Sorry about that, I'm not trying to. Let me make it up to you on today's date.
bye
Hope to see you again.




New Features:

	- Selection of gender: at the biggining of the similator, the computer asks the user to input a choice of the computer response to be male or female with a specific digit. This is done by after the user choosing the gender, the response and keyword database is chosen either being a male response database, or a female response database. This allows the user to have a diffrence in audience since now the user can be male or female, giving the choice of gender a room for diffrent interactions.
eg)
	male ver.
		1
		What is your name?
		My name is Jonny Nash, what's your name?
	female ver.
		2
		What is your name?
		My name is Linda, Linda Miles. It's nice to meet you, what's your name?

	- Synonym reconizer: by using WordNet, keywords with similar meanings are able to be read by it being converted into the keyword contained in the database, but with the similar meaning. This is done by the system connecting to a WordNet dictionary database containig synonyms of words, by searching for synonyms in that database then allows the program to search inside the response database with the converted keyword which might be contained in the program.
eg)
	1
	What is your favorite movie?
	I really don't watch that much, but I did really enjoy Pacific Rim, that was awesome.

	1
	What is your favorite film?
	I really don't watch that much, but I did really enjoy Pacific Rim, that was awesome.


Limitations:

	- Not a large enough database, so the variety of the response might be small and narrow.
	- Not able to record users previous inputs. There is no database or functions to record the users information so the program will forget everything the user just inpputted, making the conversation sometime not so smooth.
	- Was not able to implement OpenNLP or Stanford toolkit: Not enough time and skill to implement these new features into the program.


Features capable to be implemented in other API:

	- Keyword & response reader: Reading the users input and searching inside the response with the same keywords in the database.
	- WordNet synonym reconizer: Finding the word with similar meaning inside the WordNet dictonary database.
	- Question reconizer: Looking at the user input with specific characters like "?", "what", "how", etc... to determine if the input is a question or not.
	- Keyword and Response database: The style of the database allowing with diffrent subjects other that a chatbot is possible to be implemented by changing the response into something else, but still have it connected to the keywords.
	- sentence-locator and word-locator: Depending if we want to find the keyword at the end, start of the sentence, or just looking at the sentence if it contains the keyword (specified inside the database). 














