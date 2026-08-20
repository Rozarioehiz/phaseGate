        
    const  scanner = require("prompt-sync")();

                    let sum = 0;

                    for(let count = 1; count <=10; count++){

                   const score = Number(scanner("Enter Scores: "));

              

                      sum += score;

                }

                       console.log(sum);

