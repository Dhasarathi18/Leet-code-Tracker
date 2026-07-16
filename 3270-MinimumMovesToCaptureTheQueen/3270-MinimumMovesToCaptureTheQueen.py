# Last updated: 7/16/2026, 7:54:57 PM
class Solution:
    def minMovesToCaptureTheQueen(self, a, b, c, d, e, f):
        if a == e:
            if c == a and min(b, f) < d < max(b, f):
                pass
            else:
                return 1
        if b == f:
            if d == b and min(a, e) < c < max(a, e):
                pass
            else:
                return 1
        if abs(c - e) == abs(d - f):
            if abs(c - a) == abs(d - b):
                if min(c, e) < a < max(c, e) and min(d, f) < b < max(d, f):
                    pass
                else:
                    return 1
            else:
                return 1
        return 2