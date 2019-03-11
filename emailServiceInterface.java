package com.innerclass;
public interface EmailServiceInterface
{
	public void sendEmail(EmailDetails email_details_obj);
	class EmailDetails // this class is one and only required for emailServiceInterface hence its recommended to define it with in this interface itself
	{
		String to_list;
		String cc_list;
		String Subject;
		StringBuffer body;
	}
}