/*
 * Copyright 2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.integration.store;

import java.util.Collection;

import org.springframework.messaging.Message;

/**
 * The {@link MessageGroup} factory strategy.
 * This strategy is used from the {@link MessageGroup}-aware components, e.g. {@code MessageGroupStore}.
 *
 * @author Artem Bilan
 * @since 4.3
 */
public interface MessageGroupFactory {

	MessageGroup create(Object groupId);

	MessageGroup create(Collection<? extends Message<?>> messages, Object groupId);

	MessageGroup create(Collection<? extends Message<?>> messages, Object groupId, long timestamp,
						boolean complete);

}
