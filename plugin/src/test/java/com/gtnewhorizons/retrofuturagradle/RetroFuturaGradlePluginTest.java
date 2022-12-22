/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gtnewhorizons.retrofuturagradle;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Test;

/**
 * A simple unit test for the 'retrofuturagradle.greeting' plugin.
 */
class RetroFuturaGradlePluginTest {
    @Test
    void pluginRegistersTasks() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("com.gtnewhorizons.retrofuturagradle");

        // Verify important targets
        assertNotNull(project.getTasks().findByName("downloadLauncherAllVersionsManifest"));
        assertNotNull(project.getTasks().findByName("downloadLauncherVersionManifest"));
        assertNotNull(project.getTasks().findByName("downloadAssetManifest"));
        assertNotNull(project.getTasks().findByName("cleanVanillaAssets"));
        assertNotNull(project.getTasks().findByName("downloadVanillaAssets"));
        assertNotNull(project.getTasks().findByName("downloadVanillaJars"));
        assertNotNull(project.getTasks().findByName("runVanillaClient"));
        assertNotNull(project.getTasks().findByName("runVanillaServer"));

        assertNotNull(project.getTasks().findByName("downloadFernflower"));
        assertNotNull(project.getTasks().findByName("extractForgeUserdev"));
        assertNotNull(project.getTasks().findByName("extractMcpData"));
        assertNotNull(project.getTasks().findByName("generateForgeSrgMappings"));
        assertNotNull(project.getTasks().findByName("mergeVanillaSidedJars"));
        assertNotNull(project.getTasks().findByName("deobfuscateMergedJarToSrg"));
        assertNotNull(project.getTasks().findByName("decompileSrgJar"));
    }
}
