package com.hfad.panidomu.recyclerView;

import com.hfad.panidomu.database.ManagerDb;

import java.util.List;

public class TestCardView {
    private String title;
    private ManagerDb managerDb;

    public TestCardView(){}

    public TestCardView(String title) {
        this.title = title;
    }


//    public TestCardView[] testItem = getData();


    public TestCardView[] getData(){
        managerDb.openDb();
        List<String> listTitle = managerDb.getFromDB();
        TestCardView[] massiveTest = new TestCardView[listTitle.size()];
        for (int i = 0; i < massiveTest.length; i++) {
            massiveTest[i] = new TestCardView(listTitle.get(i));
        }
        managerDb.closeDb();
        return massiveTest;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
