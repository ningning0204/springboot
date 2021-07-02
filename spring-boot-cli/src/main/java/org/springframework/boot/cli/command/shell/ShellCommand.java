/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.cli.command.shell;

import org.springframework.boot.cli.command.AbstractCommand;
import org.springframework.boot.cli.command.Command;

/**
 * {@link Command} to start a nested REPL shell.
 * 
 * @author Phillip Webb
 * @see Shell
 */
public class ShellCommand extends AbstractCommand {

	public ShellCommand() {
		super("shell", "Start a nested shell");
	}

	@Override
	public void run(String... args) throws Exception {
		new Shell().run();
	}

}
