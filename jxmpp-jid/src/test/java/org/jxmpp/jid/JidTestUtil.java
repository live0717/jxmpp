/**
 *
 * Copyright © 2015 Florian Schmaus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jxmpp.jid;

import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.stringprep.XmppStringprepException;

public class JidTestUtil {

	public static final DomainBareJid EXAMPLE_ORG;
	public static final BareJid DUMMY_AT_EXAMPLE_ORG;
	public static final FullJid DUMMY_AT_EXAMPLE_ORG_SLASH_DUMMYRESOURCE;

	public static final BareJid BARE_JID_1;
	public static final BareJid BARE_JID_2;

	public static final FullJid FULL_JID_1_RESOURCE_1;
	public static final FullJid FULL_JID_1_RESOURCE_2;
	public static final FullJid FULL_JID_2_RESOURCE_1;
	public static final FullJid FULL_JID_2_RESOURCE_2;

	public static final DomainBareJid DOMAIN_BARE_JID_1;
	public static final DomainBareJid DOMAIN_BARE_JID_2;

	public static final DomainFullJid DOMAIN_FULL_JID_1;
	public static final DomainFullJid DOMAIN_FULL_JID_2;

	public static final DomainBareJid MUC_EXAMPLE_ORG;
	public static final DomainBareJid PUBSUB_EXAMPLE_ORG;

	static {
		try {
			EXAMPLE_ORG = JidCreate.domainBareFrom("example.org");
			DUMMY_AT_EXAMPLE_ORG = JidCreate.bareFrom("dummy@example.org");
			DUMMY_AT_EXAMPLE_ORG_SLASH_DUMMYRESOURCE = JidCreate.fullFrom("dummy@example.org/dummyresource");

			BARE_JID_1 = JidCreate.bareFrom("one@exampleOne.org");
			BARE_JID_2 = JidCreate.bareFrom("one@exampleTwo.org");

			FULL_JID_1_RESOURCE_1 = JidCreate.fullFrom("one@exampleOne.org/resourceOne");
			FULL_JID_1_RESOURCE_2 = JidCreate.fullFrom("one@exampleOne.org/resourceTwo");
			FULL_JID_2_RESOURCE_1 = JidCreate.fullFrom("two@exampleTwo.org/resourceOne");
			FULL_JID_2_RESOURCE_2 = JidCreate.fullFrom("two@exampleTwo.org/resourceTwo");

			DOMAIN_BARE_JID_1 = JidCreate.domainBareFrom("exampleOne.org");
			DOMAIN_BARE_JID_2 = JidCreate.domainBareFrom("exampleTwo.org");

			DOMAIN_FULL_JID_1 = JidCreate.domainFullFrom("exampleOne.org/oneResource");
			DOMAIN_FULL_JID_2 = JidCreate.domainFullFrom("exampleTwo.org/twoResource");

			MUC_EXAMPLE_ORG = JidCreate.domainBareFrom("muc.example.org");
			PUBSUB_EXAMPLE_ORG = JidCreate.domainBareFrom("pubsub.example.org");
		} catch (XmppStringprepException e) {
			throw new IllegalStateException(e);
		}
	}
}
