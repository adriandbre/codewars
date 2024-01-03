function rgb(r, g, b){
    let fixTooBigOrSmall = [r, g, b].map(el => el > 255 ? 255 : el < 0 ? 0 : el);
    let convertToHex = fixTooBigOrSmall.map(el => parseInt(el).toString(16));

    return convertToHex.map(el => el.length < 2 ? `0${el.toUpperCase()}` : el.toUpperCase()).join(""); 
}