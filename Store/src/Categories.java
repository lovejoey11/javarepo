public abstract class Categories {
	
		public abstract String getCname();
		public abstract String getCID();
		public abstract String getCdesc();
		
		@Override
		public String toString(){
			return "Product name: "+this.getCname()+", ID: "+this.getCID();
		}
	
}
