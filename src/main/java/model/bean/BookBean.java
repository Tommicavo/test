package model.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookBean {
	
	private Long idBook;
	private String titleBook;
	private int pagesBook;
	private double priceBook;
	private boolean isLowBook;
	private LocalDate publicationDateBook;
	private LocalDateTime insertDateBook;
	private LocalDateTime updateDateBook;
	private boolean isDeletedBook;
	private Long idClient;
	private Long idSeller;
	private Long idAuthor;
	
	public BookBean() {}

	public Long getIdBook() {
		return idBook;
	}
	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}
	public String getTitleBook() {
		return titleBook;
	}
	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}
	public int getPagesBook() {
		return pagesBook;
	}
	public void setPagesBook(int pagesBook) {
		this.pagesBook = pagesBook;
	}
	public double getPriceBook() {
		return priceBook;
	}
	public void setPriceBook(double priceBook) {
		this.priceBook = priceBook;
	}
	public boolean isLowBook() {
		return isLowBook;
	}
	public void setLowBook(boolean isLowBook) {
		this.isLowBook = isLowBook;
	}
	public LocalDate getPublicationDateBook() {
		return publicationDateBook;
	}
	public void setPublicationDateBook(LocalDate publicationDateBook) {
		this.publicationDateBook = publicationDateBook;
	}
	public LocalDateTime getInsertDateBook() {
		return insertDateBook;
	}
	public void setInsertDateBook(LocalDateTime insertDateBook) {
		this.insertDateBook = insertDateBook;
	}
	public LocalDateTime getUpdateDateBook() {
		return updateDateBook;
	}
	public void setUpdateDateBook(LocalDateTime updateDateBook) {
		this.updateDateBook = updateDateBook;
	}
	public boolean isDeletedBook() {
		return isDeletedBook;
	}
	public void setDeletedBook(boolean isDeletedBook) {
		this.isDeletedBook = isDeletedBook;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Long getIdSeller() {
		return idSeller;
	}
	public void setIdSeller(Long idSeller) {
		this.idSeller = idSeller;
	}
	public Long getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(Long idAuthor) {
		this.idAuthor = idAuthor;
	}

	@Override
	public String toString() {
		return "" +
				"Id: " + getIdBook() + "\n" +
				"Title: " + getTitleBook() + "\n" +
				"Pages: " + getPagesBook() + "\n" +
				"Price: " + getPriceBook() + "\n" +
				"Deleted: " + isDeletedBook() + "\n" +
				"Id Author: " + getIdAuthor() + "\n" +
				"Id Seller: " + getIdSeller() + "\n" +
				"Id Client: " + getIdClient() + "\n";
	}
}
