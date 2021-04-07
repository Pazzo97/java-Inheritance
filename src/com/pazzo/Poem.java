package com.pazzo;

public class Poem extends Literature {

    private String title;
    private String author;
    private String style;

    public Poem(String title, String author, String style) {

        super(title, author);
        this.style = style;

    }

    @Override public void Print() {

        super.Print();
        System.out.println("\tIn the Style of : " + style);

    }
}
