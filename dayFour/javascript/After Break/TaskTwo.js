        
    const  Scanner = require("prompt-sync")();

                    let sum = 0;
                    let average = 0;

                    for(let count = 1; count <=10; count++){

                   const score = Number(Scanner("Enter Scores: "));

                      sum += score;
                      average = sum / 10;

                }

                       console.log(sum);

