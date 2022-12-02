package day30;

public class Comment {
	/* 필드 : 댓글 번호, 내용, 작성자
	 * getter, setter
	 * toString
	 * 생성자 : 댓글 번호, 내용, 작성자
	 * */
	
	private int num;
	private String content, writer;
	private int boardNum;
	
	public Comment(int num, String content, String writer, int boardNum) {
		this.boardNum = boardNum;
		this.num = num;
		this.content = content;
		this.writer = writer;
	}
	
	public int getCommentNum() {
		return num;
	}
	public void setCommentNum(int commentNum) {
		this.num = commentNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Comment [commentNum=" + num + ", content=" + content + ", writer=" + writer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
