package com.kratos.bansalonlineworld.Model;

public class Post {
    private String postId;
    private String postImage;
    private String postedBy;
    private String postDescription;
    private Long postedAt;
    private int postLike;
    private int CommentCount;



    public Post() {
    }

    public Post(String postId, String postImage, String postedBy, String postDescription, Long postedAt) {
        this.postId = postId;
        this.postImage = postImage;
        this.postedBy = postedBy;
        this.postDescription = postDescription;
        this.postedAt = postedAt;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getPostDescription() {
        return postDescription;
    }
    public int getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(int commentCount) {
        CommentCount = commentCount;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public Long getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Long postedAt) {
        this.postedAt = postedAt;
    }

    public int getPostLike() {
        return postLike;
    }

    public void setPostLike(int postLike) {
        this.postLike = postLike;
    }
}
