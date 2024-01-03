function solution(str){
    let abc = str.length % 2 !== 0 ? `${str}_` : str;
    let resault = [];
  
    for (let i = 0; i < abc.length; i = i + 2) {
      let temp = `${abc[i]}${abc[i + 1]}`;
      resault.push(temp);        
      temp = "";
    }
  
    return resault;
}

// solution("abcdef");
// solution("abcdefg");
// solution("a");
// solution("");