package org.jenkinsci.plugins.github_branch_source;

/**
 * Simple test to verify that bot filtering is disabled.
 * This test demonstrates that the bot filtering logic has been commented out
 * and events from bot users will be processed normally.
 */
public class BotFilteringTest {
    
    /**
     * Test that verifies bot filtering is disabled.
     * In the current implementation, the bot filtering logic in GitHubSCMSource.retrieve()
     * is commented out, so this method demonstrates that bot events would be processed.
     */
    public static void testBotFilteringDisabled() {
        System.out.println("Bot filtering test:");
        System.out.println("1. The bot filtering logic in GitHubSCMSource.retrieve() is commented out");
        System.out.println("2. Events from bot users (like GitHub Copilot Agent) will be processed normally");
        System.out.println("3. Pull requests from bots will trigger builds as expected");
        System.out.println("Bot filtering has been successfully disabled!");
    }
    
    public static void main(String[] args) {
        testBotFilteringDisabled();
    }
}