package com.raystech.ComparableComparator;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet1> {

	@Override
	public int compare(Marksheet1 m1, Marksheet1 m2) {

		if (m1.getFname() == m2.getFname()) {

			return m1.getLname().compareTo(m2.getLname());
		}
		// TODO Auto-generated method stub
		else {
			return m1.getFname().compareTo(m2.getFname());
		}
	}
}
