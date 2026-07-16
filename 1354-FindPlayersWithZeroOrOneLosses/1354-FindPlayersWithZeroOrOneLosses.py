# Last updated: 7/16/2026, 7:55:31 PM
class Solution:
    def findWinners(self, matches):
        loss_count = {}
        for winner, loser in matches:
            if winner not in loss_count:
                loss_count[winner] = 0
            loss_count[loser] = loss_count.get(loser, 0) + 1
        zero_loss = []
        one_loss = []
        for player in sorted(loss_count):
            if loss_count[player] == 0:
                zero_loss.append(player)
            elif loss_count[player] == 1:
                one_loss.append(player)
        return [zero_loss, one_loss]