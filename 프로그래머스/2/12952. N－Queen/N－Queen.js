function solution(n) {
    let count = 0;
    const queens = new Array(n).fill(-1);
    
    function isValid(row) {
        for (let i = 0; i < row; i++) {
            // 같은 열에 있는 경우
            if (queens[i] === queens[row]) return false;

            // 대각선 상에 있는 경우 (기울기가 1 또는 -1)
            const columnDiff = Math.abs(queens[i] - queens[row]);
            const rowDiff = row - i;
            if (columnDiff === rowDiff) return false;
        }
        return true;
    }
    
        function backtrack(row) {
        if (row === n) {
            count++;
            return;
        }

        for (let col = 0; col < n; col++) {
            queens[row] = col;
            if (isValid(row)) {
                backtrack(row + 1);
            }
        }
    }

    backtrack(0);
    return count;
}