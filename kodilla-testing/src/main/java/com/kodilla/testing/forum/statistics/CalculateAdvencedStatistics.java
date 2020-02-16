package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateAdvencedStatistics implements Statistics {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsByUser;
    double averageCommentsByUser;
    double averageCommentsByPost;

    public CalculateAdvencedStatistics(int usersQuantity, int postsQuantity, int commentsQuantity) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double averagePostsByUser = usersQuantity / postsQuantity;
        double averageCommentsByUser = usersQuantity / commentsQuantity;
        double averageCommentsByPost = commentsQuantity / postsQuantity;

    }

    public double showStatistics() {
        return averagePostsByUser + averageCommentsByUser + averageCommentsByPost;
    }

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}
