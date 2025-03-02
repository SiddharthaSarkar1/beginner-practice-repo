function ArmstrongNumber(num) {
  let temp = num;
  let sum = 0;
  let digitCount = num.toString().length;

  while (temp !== 0) {
    let digit = temp % 10;
    sum += Math.pow(digit, digitCount);
    temp = Math.floor(temp / 10);
  }

  return sum == num;
}

let num = 371;
console.log(
  ArmstrongNumber(num)
    ? `${num} is an Armstrong Number.`
    : `${num} is not an Armstrong Number.`
);
