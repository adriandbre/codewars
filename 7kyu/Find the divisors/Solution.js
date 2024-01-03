function divisors(integer) {
    let res = [];
    for (let i = 2; i < integer; i++) {
        if (integer % i == 0) {
            res.push(i);
        }
    }

    return res.length > 0 ? res : `${integer} is prime`;
};