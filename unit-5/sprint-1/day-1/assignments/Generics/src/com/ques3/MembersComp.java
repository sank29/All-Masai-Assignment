package com.ques3;

import java.util.Comparator;

public class MembersComp implements Comparator<Members> {

	@Override
	public int compare(Members members1, Members members2) {
//
//		if (members1.getMembershipEnddate().compareTo(members2.getMembershipEnddate())) {
//			return +1;
//
//		} else {
//			return -1;
//		}
		return members1.getMembershipEnddate().compareTo(members2.getMembershipEnddate());
	}

}
