
package esendex.sdk.java.service.impl;

import esendex.sdk.java.service.ContactService;
import esendex.sdk.java.service.InboxService;
import esendex.sdk.java.service.MessagingService;
import esendex.sdk.java.service.SentService;

/**
 * A factory for creating IService objects.
 * @author Mike Whittaker
 */
public interface IServiceFactory {

	/**
	 * Obtains a service suitable for sending voice and sms messages
	 * @return the service
	 */
	MessagingService getMessagingService();

	/**
	 * Obtains a service suitable for querying sent messages
	 * @return the service
	 */
	SentService getSentService();

	/**
	 * Obtains a service suitable for querying the inbox for messages
	 * @return the service
	 */
	InboxService getInboxService();

    /**
     * Obtains a service suitable for create, read, update and delete
     * operations on the users contacts.
     * @return the service
     */
	ContactService getContactService();

}