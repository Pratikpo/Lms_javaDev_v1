package com.lgi.lms.conf;

public class Constants {

	public enum PolicyStatus{
		Active(1, "Active"), Inactive(0, "Inactive");
		
		private final int id;
		private final String label;

		PolicyStatus(int id, String label) {
	        this.id = id;
	        this.label = label;
	    }

		public int getId() {
			return id;
		}

		public String getLabel() {
			return label;
		}

	}
}
