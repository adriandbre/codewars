function generateHashtag (str) {
    if (str.replace(/\s/g, "").length > 140 || str.replace(/\s/g, "").length == 0) return false; 
    const word = str.split(" ").map(el => `${el.charAt(0).toUpperCase()}${el.substring(1)}`).join("");
    
    return `#${word}`.length > 140 ? false : `#${word}`;
}