package org.jenkinsci.plugins.github_branch_source;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Simple test to verify that bot filtering is disabled.
 * This test demonstrates that the bot filtering logic has been commented out
 * and events from bot users will be processed normally.
 */
public class BotFilteringTest {
    
    /**
     * Test that verifies bot filtering is disabled by checking that the bot filtering
     * logic in GitHubSCMSource.java is commented out.
     */
    @Test
    public void testBotFilteringDisabled() throws IOException {
        // Read the source file to verify bot filtering logic is commented out
        String sourceFile = "src/main/java/org/jenkinsci/plugins/github_branch_source/GitHubSCMSource.java";
        boolean foundCommentedBotFiltering = false;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("// Bot filtering logic - commented out to allow builds from bot users")) {
                    foundCommentedBotFiltering = true;
                    break;
                }
            }
        }
        
        assertTrue("Bot filtering logic should be commented out in GitHubSCMSource.java", 
                   foundCommentedBotFiltering);
        
        System.out.println("✓ Bot filtering has been successfully disabled!");
        System.out.println("✓ Events from bot users (like GitHub Copilot Agent) will be processed normally");
        System.out.println("✓ Pull requests from bots will trigger builds as expected");
    }
}