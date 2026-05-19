function fibonacci(n1,n2,n){
    let sum=n1+n2;
    if(sum>n)return;
    cnsole.log(" "+sum);
    fibonacci(n2,sum,n);
}

fibonacci(0,1,5);