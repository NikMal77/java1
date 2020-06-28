package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString(){
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num){
        this.a += num.a;
        this.b += num.b;
        return this;
    }

    public ComplexNum sub(ComplexNum num){
        this.a -= num.a;
        this.b -= num.b;
        return this;
    }

    public ComplexNum mul(ComplexNum num){
        int a_, b_;
        a_ = this.a * num.a - this.b * num.b;
        b_ = this.b * num.a + this.a * num.b;
        this.a = a_;
        this.b = b_;
        return this;
    }

    public ComplexNum div(ComplexNum num){
        double a_, b_;
        if (!(num.a == 0 && num.b == 0)){
            double del = num.a * num.a + num.b * num.b;
            a_ = (this.a * num.a + this.b * num.b)/del;
            b_ = (this.b * num.a - this.a * num.b)/del;
            this.a = (int) a_;
            this.b = (int) b_;
            return this;
        }
        else return num;
    }


}
