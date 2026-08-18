def  grading(score_one, score_two, score_three):



    total_score = score_one + score_two+ score_three
    average_score = total_score / 3

    if(average_score <= 90 and average_score <= 100):
        letter = "A"

    elif(average_score <= 80 and  average_score <= 90):
            letter = "B"
    elif(average_score  <= 70 and  average_score <= 80):
            letter = "C"

    elif(average_score <= 60 and average_score <= 70):

            letter = "D"

    elif(average_score  <=0 and average_score <= 60):
            letter = "F"

    return letter


scoreOne = int(input("enter First Score"))

scoreTwo = int(input("Enter second Score"))

scoreThree = int(input("Enter third score"))
 
Scores =  grading(scoreOne, scoreTwo, scoreThree)

print("the AverageScore is " + Scores)
