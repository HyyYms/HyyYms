package com.company.exception;

/**
 * @program: TextSimilarityAnalysis
 * @description: 空文本异常
 * @author: Mr.Huang
 * @create: 2020-09-24 19:05
 **/
public class EmptyTextException extends RuntimeException {
    public EmptyTextException() {
        super();
    }

    public EmptyTextException(String message) {
        super(message);
    }

    public EmptyTextException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyTextException(Throwable cause) {
        super(cause);
    }
}
