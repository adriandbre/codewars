def solution(s):
    import re
    resault = re.sub(r'([A-Z])', r' \1', s)
    return resault