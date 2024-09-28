let i = 1;
while (i <= 10) {
    console.log(i);
    if (i % 3 == 0) {
        console.log(i + " Este número é múltiplo de 3.")
    } else if (i % 5 == 0) {
        console.log(i + " Este número é múltiplo de 5.")
    }
    i++;
}