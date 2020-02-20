package com.kodilla.testing.forum.statistics;

public class CalculateAdvencedStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsByUser;
    private double averageCommentsByUser;
    private double averageCommentsByPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averageCommentsByUser = commentsQuantity/ usersQuantity;
        if(postsQuantity != 0) {
            averagePostsByUser = usersQuantity / postsQuantity;
            averageCommentsByPost = commentsQuantity / postsQuantity;
        }else{
            averagePostsByUser = 0;
            averageCommentsByPost = 0;
        }
    }


    public double showStatistics() {
        return averagePostsByUser + averageCommentsByUser + averageCommentsByPost;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsByUser() {
        return averagePostsByUser;
    }

    public double getAverageCommentsByUser() {
        return averageCommentsByUser;
    }

    public double getAverageCommentsByPost() {
        return averageCommentsByPost;
    }
}
