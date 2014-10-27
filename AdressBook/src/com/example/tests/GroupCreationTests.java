package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
  @Test
  public void testAddNonEmptyGroup() {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().createNewGroup();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroup();
  }
   
  @Test
  public void testAddEmptyGroup() {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().createNewGroup();
    GroupData group = new GroupData();
    group.name = "";
    group.header = "";
    group.footer = "";
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroup();
  }
}
