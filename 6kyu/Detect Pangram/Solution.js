function isPangram(string){
    let reg = /([a-z])(?!.*\1)/gi;
    return (string.match(reg) || []).length === 26;
}