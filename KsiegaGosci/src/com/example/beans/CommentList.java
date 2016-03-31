package com.example.beans;

import java.util.LinkedList;

public class CommentList {
	LinkedList<Comment> comments;
	
	public CommentList() {
		this.comments = new LinkedList<Comment>();
	}
	
	public void add(String n, String e, String c) {
		this.comments.add(new Comment(n,e,c));
	}
	
	public LinkedList<Comment> getComments() {
		return comments;
	}

	public void setComments(LinkedList<Comment> comments) {
		this.comments = comments;
	}

	public class Comment {		
		public String name;
		public String email;
		public String comment;
		
		public Comment(String n, String e, String c) {
			name = n;
			email = e;
			comment = c;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		
	}
}
