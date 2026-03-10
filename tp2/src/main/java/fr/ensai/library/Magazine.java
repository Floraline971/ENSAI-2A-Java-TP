package fr.ensai.library;

public class Magazine (String issn, String title, int issueNumber, int year, int pageCount) {
    super(title, year, pageCount);
    this.issn = issn;
    this.issueNumber = issueNumber;
}

@Override
public String toString(){
    return String.format("Magazine %s n° %d, this.title",this.title, this.issueNumber);
}