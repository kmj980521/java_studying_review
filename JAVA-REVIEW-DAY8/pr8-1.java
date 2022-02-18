package Member;

public class member {
		private int memberId;
		private String memberName;
		public int hashCode()
		{
			return memberId;
		}
		public member(int memberId, String memberName)
		{
			this.memberId=memberId;
			this.memberName=memberName;
		}
		public int getMemberId()
		{
			return memberId;
		}
		public String getMemberName()
		{
			return memberName;
		}
		public void setMemberName(String memberName)
		{
			this.memberName=memberName;
		}
		public void setMemberId(int memberId)
		{
			this.memberId=memberId;
		}
		@Override public String toString()
		{
			return memberName+"회원님의 아이디는"+memberId+"입니다!";
		}
		@Override public boolean equals(Object obj)
		{
			if(obj instanceof member)
			{
				member ex =(member)obj;
				if(this.memberId==ex.memberId)
				{
					return true;
				}
				else 
					return false;
			}
			return false;
		}

}

