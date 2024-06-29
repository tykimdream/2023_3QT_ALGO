function solution(s, n) {
  let upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  let lower = "abcdefghijklmnopqrstuvwxyz";
  let answer = "";

  for (let i = 0; i < s.length; i++) {
    let text = s[i];
    if (text == " ") {
      answer += " ";
      continue;
    }
    let textArr = upper.includes(text) ? upper : lower;
    let index = (textArr.indexOf(text) + n) % 26;
    answer += textArr[index];
  }
  return answer;
}