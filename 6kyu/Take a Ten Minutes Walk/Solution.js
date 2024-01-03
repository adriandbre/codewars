function isValidWalk(walk) {
    return walk.length == 10 ? walk.filter(el => el == 'n').length == walk.filter(el => el == 's').length && walk.filter(el => el == 'w').length == walk.filter(el => el == 'e').length : false;
}