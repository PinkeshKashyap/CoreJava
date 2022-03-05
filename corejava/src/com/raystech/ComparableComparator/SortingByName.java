package com.raystech.ComparableComparator;

import java.util.Comparator;

public class SortingByName implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {

		if (e1.getFname() == e2.getFname()) {
			return e1.getLname().compareTo(e2.getLname());
		}

		else
			return e1.getFname().compareTo(e2.getFname());
	}
}
