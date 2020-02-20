package com.kodilla.testing.forum.statistics;

public class CalculateAdvencedStatistics {
    private double usersQuantity;
    private double postsQuantity;
    private double commentsQuantity;
    private double averagePostsByUser;
    private double averageCommentsByUser;
    private double averageCommentsByPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(commentsQuantity != 0 || usersQuantity != 0) {
            averageCommentsByUser = commentsQuantity / usersQuantity;
        }else{
            averageCommentsByUser = 0;
        }
        if(postsQuantity != 0) {
            averagePostsByUser = postsQuantity / usersQuantity ;
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
        return (int) usersQuantity;
    }

    public int getPostsQuantity() {
        return (int) postsQuantity;
    }

    public int getCommentsQuantity() {
        return (int) commentsQuantity;
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
