package model.dto;

import java.time.LocalDate;

public class BookDto {
	
	private Long idBook;
	private String titleBook;
	private int pagesBook;
	private double priceBook;
	private boolean isLowBook;
	private LocalDate publicationDateBook;
	private Long idClient;
	private Long idSeller;
	private Long idAuthor;
	
	public BookDto() {}

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
}
