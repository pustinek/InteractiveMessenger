package me.pustinek.interactivemessenger.testing.unit;

import me.pustinek.interactivemessenger.generators.ConsoleGenerator;
import me.pustinek.interactivemessenger.message.InteractiveMessage;
import me.pustinek.interactivemessenger.parsers.YamlParser;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestConsoleGenerator {

	@Test
	public void interactiveMessageShouldStayIntact() {
		InteractiveMessage originalMessage = YamlParser.parse(Arrays.asList("[red]hello![bread]", "[blue]this is a message!"));
		InteractiveMessage usedMessage = originalMessage.copy();
		ConsoleGenerator.generate(usedMessage);

		assertEquals("ConsoleGenerator should not change the given InteractiveMessage", originalMessage, usedMessage);
	}

}
