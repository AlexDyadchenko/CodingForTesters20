package com.example.tests;

import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase {

  @Test
  public void testAddNonEmptyGroup() throws Exception {
	openMainPage();
    openGroupsPage();
    createNewGroup();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	fillGroupForm(group);
    submitGroup();
  }
   
  @Test
  public void testAddEmptyGroup() throws Exception {
	openMainPage();
    openGroupsPage();
    createNewGroup();
    fillGroupForm(new GroupData("", "", ""));
    submitGroup();
  }
}