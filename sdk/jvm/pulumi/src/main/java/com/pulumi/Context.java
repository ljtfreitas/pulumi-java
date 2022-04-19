package com.pulumi;

import com.pulumi.context.ConfigContext;
import com.pulumi.context.LoggingContext;
import com.pulumi.context.OutputContext;
import com.pulumi.core.Output;

/**
 * Provides the current context to the stack callback.
 */
public interface Context extends OutputContext, ConfigContext {

    /**
     * @return the name of the current project
     */
    String projectName();

    /**
     * @return the name of the current stack
     */
    String stackName();

    /**
     * @return the logger context
     */
    LoggingContext log();

    /**
     * Exports and {@link Output} from a Pulumi stack.
     * @param name name of the {@code Output}
     * @param output the {@code Output} value
     * @return the {@link Exports} associated with current {@link Context}
     */
    Exports export(String name, Output<?> output);

    /**
     * Used to finish a stack callback.
     * @return the {@link Exports} associated with current {@link Context}
     */
    Exports exports();
}
