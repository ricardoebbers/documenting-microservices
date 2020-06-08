DROP TABLE IF EXISTS greetings;

CREATE TABLE greetings
(
    id IDENTITY NOT NULL PRIMARY KEY,
    lang VARCHAR NOT NULL,
    content VARCHAR NOT NULL
);

INSERT INTO greetings(lang, content) VALUES('Arabic', 'Marhaba');
INSERT INTO greetings(lang, content) VALUES('Bavarian and Austrian German', 'Grüß Gott');
INSERT INTO greetings(lang, content) VALUES('Bengali', 'Namaskar');
INSERT INTO greetings(lang, content) VALUES('Bulgarian', 'Zdraveite');
INSERT INTO greetings(lang, content) VALUES('Catalan', 'Hola');
INSERT INTO greetings(lang, content) VALUES('Chamorro', 'Hafa adai');
INSERT INTO greetings(lang, content) VALUES('Chinese', 'Nǐ hǎo');
INSERT INTO greetings(lang, content) VALUES('Croatian', 'Dobro Jutro');
INSERT INTO greetings(lang, content) VALUES('Danish', 'God dag');
INSERT INTO greetings(lang, content) VALUES('Dutch', 'Hoi');
INSERT INTO greetings(lang, content) VALUES('Finnish', 'hyvää päivää');
INSERT INTO greetings(lang, content) VALUES('French', 'Bonjour');
INSERT INTO greetings(lang, content) VALUES('Gaeilge', 'Dia dhuit');
INSERT INTO greetings(lang, content) VALUES('German', 'Guten tag');
INSERT INTO greetings(lang, content) VALUES('Greek', 'Yasou');
INSERT INTO greetings(lang, content) VALUES('Hebrew', 'Shalom');
INSERT INTO greetings(lang, content) VALUES('Hindi', 'Namaste');
INSERT INTO greetings(lang, content) VALUES('Hungarian', 'Jo napot');
INSERT INTO greetings(lang, content) VALUES('Icelandic', 'Góðan dag');
INSERT INTO greetings(lang, content) VALUES('Igbo', 'Nde-ewo');
INSERT INTO greetings(lang, content) VALUES('Indonesian', 'Selamat siang');
INSERT INTO greetings(lang, content) VALUES('Italian', 'Salve');
INSERT INTO greetings(lang, content) VALUES('Japanese', 'Konnichiwa');
INSERT INTO greetings(lang, content) VALUES('Korean', 'Ahn nyong ha se yo');
INSERT INTO greetings(lang, content) VALUES('Latin', 'Salve');
INSERT INTO greetings(lang, content) VALUES('Lithuanian', 'Sveiki');
INSERT INTO greetings(lang, content) VALUES('Luxembourgish', 'Moïen');
INSERT INTO greetings(lang, content) VALUES('Maltese', 'Bonġu');
INSERT INTO greetings(lang, content) VALUES('Nahuatl', 'Niltze');
INSERT INTO greetings(lang, content) VALUES('Nepali', 'Namastē');
INSERT INTO greetings(lang, content) VALUES('Norwegian', 'Hallo');
INSERT INTO greetings(lang, content) VALUES('Persian', 'Salam');
INSERT INTO greetings(lang, content) VALUES('Polish', 'Cześć');
INSERT INTO greetings(lang, content) VALUES('Portuguese', 'Olá');
INSERT INTO greetings(lang, content) VALUES('Romanian', 'Bună ziua');
INSERT INTO greetings(lang, content) VALUES('Russian', 'Zdravstvuyte');
INSERT INTO greetings(lang, content) VALUES('Serbian', 'Zdravo');
INSERT INTO greetings(lang, content) VALUES('Slovak', 'Ahoj');
INSERT INTO greetings(lang, content) VALUES('Spanish', 'Hola');
INSERT INTO greetings(lang, content) VALUES('Swahili', 'Hujambo');
INSERT INTO greetings(lang, content) VALUES('Swedish', 'Hallå');
INSERT INTO greetings(lang, content) VALUES('Tahitian', 'Ia orna');
INSERT INTO greetings(lang, content) VALUES('Thai', 'Sawasdee');
INSERT INTO greetings(lang, content) VALUES('Tsonga', 'Avuxeni');
INSERT INTO greetings(lang, content) VALUES('Turkish', 'Merhaba');
INSERT INTO greetings(lang, content) VALUES('Ukrainian', 'Zdravstvuyte');
INSERT INTO greetings(lang, content) VALUES('Urdu', 'Assalamo aleikum');
INSERT INTO greetings(lang, content) VALUES('Vietnamese', 'xin chào');
INSERT INTO greetings(lang, content) VALUES('Welsh', 'Shwmae');
INSERT INTO greetings(lang, content) VALUES('Zulu', 'Sawubona');
