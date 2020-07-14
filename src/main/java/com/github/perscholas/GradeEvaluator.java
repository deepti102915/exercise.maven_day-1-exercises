package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(double score) {
        return (score >= 90 && score <= 100);
    }

    public Boolean isGradeB(double score) {
        return (score >= 80 && score <= 89);
    }

    public Boolean isGradeC(double score) {
        return (score >= 70 && score <= 79);
    }

    public Boolean isGradeD(double score) {
        return (score >= 65 && score <= 69);
    }

    public Boolean isGradeF(double score) {
        return (score <= 64);
    }

    public Character getGrade(Double score) {

        if (isGradeA(score)) {
            return 'A';
        } else if (isGradeB(score)) {
            return 'B';
        } else if (isGradeC(score)) {
            return 'C';
        } else if (isGradeD(score)) {
            return 'D';
        }
        else if (isGradeF(score)) {
            return 'F';
        }
        else return 'F';

    }
}

