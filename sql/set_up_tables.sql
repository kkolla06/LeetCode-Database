CREATE TABLE Member
(username VARCHAR2(50),
 email VARCHAR2(100),
 password VARCHAR2(50),
 PRIMARY KEY (username),
 UNIQUE (email));
CREATE TABLE PremiumMember
(username VARCHAR2(50),
 creditCardNum VARCHAR2(16) NOT NULL,
 PRIMARY KEY (username),
 FOREIGN KEY (username) REFERENCES Member(username));
CREATE TABLE Problem
(problemNum INTEGER,
 title VARCHAR2(120),
 acceptance FLOAT,
 difficulty VARCHAR2(6),
 PRIMARY KEY (problemNum),
 UNIQUE (title));
CREATE TABLE Solution1
(problemNum INTEGER,
 approachNum INTEGER,
 title VARCHAR2(120),
 PRIMARY KEY (problemNum, approachNum),
 FOREIGN KEY (problemNum) REFERENCES Problem(problemNum));
CREATE TABLE Solution2
(problemNum INTEGER,
 lang VARCHAR2(10),
 approachNum INTEGER,
 PRIMARY KEY (problemNum, lang, approachNum),
 FOREIGN KEY (problemNum) REFERENCES Problem(problemNum));
CREATE TABLE Discussion
(discussionID INTEGER,
 submissionTime TIMESTAMP,
 upvotes INTEGER,
 viewsNum INTEGER,
 memberUsername VARCHAR2(120) NOT NULL,
 problemNum INTEGER NOT NULL,
 PRIMARY KEY (discussionID),
 UNIQUE (memberUsername, submissionTime),
 FOREIGN KEY (memberUsername) REFERENCES Member(username),
 FOREIGN KEY (problemNum) REFERENCES Problem(problemNum));
CREATE TABLE Submission1
(runtime FLOAT,
 status VARCHAR2(8),
 PRIMARY KEY (runtime));
CREATE TABLE Submission2
(submissionID INTEGER,
 lang VARCHAR2(10),
 status VARCHAR2(8),
 runtime FLOAT,
 memory FLOAT,
 problemNum INTEGER NOT NULL,
 username VARCHAR2(50) NOT NULL,
 timeSubmitted TIMESTAMP,
 PRIMARY KEY (submissionID),
 UNIQUE (username, timeSubmitted),
 FOREIGN KEY (problemNum) REFERENCES Problem(problemNum),
 FOREIGN KEY (username) REFERENCES Member(username));
CREATE TABLE Contest
("NUMBER" INTEGER,
 status VARCHAR2(9),
 PRIMARY KEY("NUMBER"));
CREATE TABLE Company
(name VARCHAR2(50),
 PRIMARY KEY(name));
CREATE TABLE Topic
(name VARCHAR2(50),
 PRIMARY KEY(name));
CREATE TABLE CompanyCategorizedProblems
(problemNum INTEGER,
 companyName VARCHAR2(50),
 PRIMARY KEY(problemNum, companyName),
 FOREIGN KEY(problemNum) REFERENCES Problem(problemNum),
 FOREIGN KEY(companyName) REFERENCES Company(name));
CREATE TABLE TopicTaggedProblems
(problemNum INTEGER,
 topicName VARCHAR2(50),
 PRIMARY KEY(problemNum, topicName),
 FOREIGN KEY(problemNum) REFERENCES Problem(problemNum),
 FOREIGN KEY(topicName) REFERENCES Topic(name));
CREATE TABLE MemberParticipatesInContest
(username VARCHAR2(50),
 contestNumber INTEGER,
 finishTime TIMESTAMP,
 score INTEGER,
 PRIMARY KEY(username, contestNumber),
 FOREIGN KEY(username) REFERENCES Member(username),
 FOREIGN KEY(contestNumber) REFERENCES Contest("NUMBER"));

INSERT INTO Member(username, email, password)
VALUES ('tylershaw', 'tylershaw1999@gmail.com', 'Tsshaw10!10@');
INSERT INTO Member(username, email, password)
VALUES ('arianagrande', '7ringsbyari@gmail.com', 'Donutandsweets911!');
INSERT INTO Member(username, email, password)
VALUES ('ririrocks2023', 'rihanna_royal_superbowl@gmail.com', 'shinewithFenty101$$!');
INSERT INTO Member(username, email, password)
VALUES ('swiftyswiftxpxp', 'tswiftlovestory121019@gmail.com', 'Shakeitoff2015!');
INSERT INTO Member(username, email, password)
VALUES ('samsmith67', 'ssmithalldayyee0420@gmail.com', 'st@ywithMe005');
INSERT INTO Member(username, email, password)
VALUES ('eddySheeran', 'edsheerperf1010@gmail.com', 'strawberryLips@@!96');
INSERT INTO Member(username, email, password)
VALUES ('baebeyonce711', 'crazyinlove9999@gmail.com', '2000heartsForYOU!');
INSERT INTO Member(username, email, password)
VALUES ('smileyMiley', 'smileyallday@gmail.com', '2023BouqetFlowers!');
INSERT INTO Member(username, email, password)
VALUES ('lalisablink', 'lalisarocks@gmail.com', 'BlackPinkinyourarea<3!');
INSERT INTO Member(username, email, password)
VALUES ('starboy', 'theweeknd@gmail.com', 'darkKnight2018$');
INSERT INTO PremiumMember(username,creditCardNum)
VALUES ('arianagrande', '1111222233334444');
INSERT INTO PremiumMember(username,creditCardNum)
VALUES ('tylershaw', '5555666677778888');
INSERT INTO PremiumMember(username,creditCardNum)
VALUES ('ririrocks2023', '1000272791918888');
INSERT INTO PremiumMember(username,creditCardNum)
VALUES ('swiftyswiftxpxp', '5151707022228866');
INSERT INTO PremiumMember(username,creditCardNum)
VALUES ('samsmith67', '5151707022228866');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (1, 'Two Sum', 49.5, 'Easy');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (2, 'Add Two Numbers', 40.2, 'Medium');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (3, 'Longest Substring Without Repeating Characters', 33.8, 'Medium');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (4, 'Median of Two Sorted Arrays', 36.0, 'Hard');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (5, 'Longest Palindromic Substring', 32.4, 'Medium');
INSERT INTO Problem(problemNum, title, acceptance, difficulty)
VALUES (6, 'Zigzag Conversion', 44.7, 'Medium');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (1, 1, 'Two Sum BruteForce');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (1, 2, 'Two Sum Using HashMap');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (2, 1, 'Add Two Numbers Elementary Math');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (3, 1, 'Longest Substring Without Repeating Characters Brute Force');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (3, 2, 'Longest Substring Without Repeating Characters Sliding Window');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (4, 1, 'Median of Two Sorted Arrays Brute force');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (4, 2, 'Median of Two Sorted Arrays Two Pointers');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (5, 1, 'Longest Palindromic Substring Brute force');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (5, 2, ' Longest Palindromic Substring Dynamic Programming');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (6, 1, 'Zigzag Conversion Simulate Zigzag Movement');
INSERT INTO Solution1(problemNum, approachNum, title)
VALUES (6, 2, 'Zigzag Conversion String Traversal');
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (1, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (1, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (1, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (1, 'Python3', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (2, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (2, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (2, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (2, 'Python3', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (3, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (3, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (3, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (3, 'Python3', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (4, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (4, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (4, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (4, 'Python3', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (5, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (5, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (5, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (5, 'Python3', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (6, 'Java', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (6, 'Java', 2);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (6, 'Python3', 1);
INSERT INTO Solution2(problemNum, lang, approachNum)
VALUES (6, 'Python3', 2);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (1, '2020-01-01 12:01:39', 200, 784, 'tylershaw',1);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (2, '2020-01-02 12:03:40', 304, 64, 'arianagrande',2);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (3, '2020-05-02 08:03:40', 500, 1000, 'arianagrande',3);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (4, '2021-08-26 06:08:29', 30, 7, 'ririrocks2023',4);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (5, '2022-07-18 09:11:27', 397, 111, 'smileyMiley',5);
INSERT INTO Discussion(discussionID, submissionTime, upvotes, viewsNum,
                       memberUsername, problemNum)
VALUES (6, '2022-07-19 11:11:41', 600, 1392, 'smileyMiley',6);
INSERT INTO Submission1(runtime, status)
VALUES (1.5, 'accepted');
INSERT INTO Submission1(runtime, status)
VALUES (-1, 'rejected');
INSERT INTO Submission1(runtime, status)
VALUES (0.4, 'accepted');
INSERT INTO Submission1(runtime, status)
VALUES (0.2, 'accepted');
INSERT INTO Submission1(runtime, status)
VALUES (0.5, 'accepted');
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (1, 'Java', 1.5, 39, 1, 'baebeyonce711', '2022-01-03 02:37:39');
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (2, 'Java', -1, -1, 2, 'baebeyonce711', '2022-01-03 01:37:50');
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (3, 'Python3', 0.4, 32, 4, 'lalisablink', '2021-04-22 08:29:58');
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (4, 'Python3', 0.2, 37, 5, 'eddySheeran', '2021-08-31 13:33:57');
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (5, 'Java', 0.5, 49, 6, 'starboy', '2021-12-31 20:47:08' );
INSERT INTO Submission2(submissionID, lang, runtime, memory, problemNum, username,
                        timeSubmitted)
VALUES (6, 'Python3', -1, -1, 3, 'swiftyswiftxpxp', '2021-09-21 21:30:08');
INSERT INTO Contest("NUMBER", status)
VALUES (1, 'ended');
INSERT INTO Contest("NUMBER", status)
VALUES (2, 'ended');
INSERT INTO Contest("NUMBER", status)
VALUES (3, 'ended');
INSERT INTO Contest("NUMBER", status)
VALUES (4, 'open');
INSERT INTO Contest("NUMBER", status)
VALUES (5, 'open');
INSERT INTO Contest("NUMBER", status)
VALUES (6, 'open');
INSERT INTO Company(name)
VALUES ('Microsoft');
INSERT INTO Company(name)
VALUES ('Facebook');
INSERT INTO Company(name)
VALUES ('Google');
INSERT INTO Company(name)
VALUES ('Tiktok');
INSERT INTO Company(name)
VALUES ('Bloomberg');
INSERT INTO Company(name)
VALUES ('Apple');
INSERT INTO Topic(name)
VALUES ('Dynamic Programming');
INSERT INTO Topic(name)
VALUES ('Arrays');
INSERT INTO Topic(name)
VALUES ('Linked lists');
INSERT INTO Topic(name)
VALUES ('Strings');
INSERT INTO Topic(name)
VALUES ('Sorting');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (1, 'Microsoft');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (1, 'Facebook');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (1, 'Google');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (2, 'Bloomberg');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (2, 'Google');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (3, 'Google');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (3, 'Tiktok');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (4, 'Apple');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (4, 'Facebook');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (5, 'Google');
INSERT INTO CompanyCategorizedProblems(problemNum, companyName )
VALUES (6, 'Tiktok');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (1, 'Dynamic Programming');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (1, 'Arrays');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (2, 'Arrays');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (3, 'Arrays');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (3, 'Strings');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (4, 'Arrays');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (4, 'Sorting');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (5, 'Strings');
INSERT INTO TopicTaggedProblems(problemNum, topicName)
VALUES (6, 'Arrays');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('ririrocks2023', 2, '2023-01-31 20:47:08', '79');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('smileyMiley', 1, '2022-12-31 20:49:08', '90');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('samsmith67', 3, '2023-02-14 21:56:01', '68');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('starboy', 2, '2023-01-31 22:33:01', '72');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('arianagrande', 1, '2022-12-31 8:49:01', '85');
INSERT INTO MemberParticipatesInContest(username, contestNumber, finishTime, score)
VALUES ('baebeyonce711', 3, '2023-02-14 12:04:01', '81');