// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.awsnative.mwaa.inputs.EnvironmentModuleLoggingConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Logging configuration for the environment.
 * 
 */
public final class EnvironmentLoggingConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentLoggingConfiguration Empty = new EnvironmentLoggingConfiguration();

    @InputImport(name="dagProcessingLogs")
        private final @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs;

    public Optional<EnvironmentModuleLoggingConfiguration> getDagProcessingLogs() {
        return this.dagProcessingLogs == null ? Optional.empty() : Optional.ofNullable(this.dagProcessingLogs);
    }

    @InputImport(name="schedulerLogs")
        private final @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs;

    public Optional<EnvironmentModuleLoggingConfiguration> getSchedulerLogs() {
        return this.schedulerLogs == null ? Optional.empty() : Optional.ofNullable(this.schedulerLogs);
    }

    @InputImport(name="taskLogs")
        private final @Nullable EnvironmentModuleLoggingConfiguration taskLogs;

    public Optional<EnvironmentModuleLoggingConfiguration> getTaskLogs() {
        return this.taskLogs == null ? Optional.empty() : Optional.ofNullable(this.taskLogs);
    }

    @InputImport(name="webserverLogs")
        private final @Nullable EnvironmentModuleLoggingConfiguration webserverLogs;

    public Optional<EnvironmentModuleLoggingConfiguration> getWebserverLogs() {
        return this.webserverLogs == null ? Optional.empty() : Optional.ofNullable(this.webserverLogs);
    }

    @InputImport(name="workerLogs")
        private final @Nullable EnvironmentModuleLoggingConfiguration workerLogs;

    public Optional<EnvironmentModuleLoggingConfiguration> getWorkerLogs() {
        return this.workerLogs == null ? Optional.empty() : Optional.ofNullable(this.workerLogs);
    }

    public EnvironmentLoggingConfiguration(
        @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs,
        @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs,
        @Nullable EnvironmentModuleLoggingConfiguration taskLogs,
        @Nullable EnvironmentModuleLoggingConfiguration webserverLogs,
        @Nullable EnvironmentModuleLoggingConfiguration workerLogs) {
        this.dagProcessingLogs = dagProcessingLogs;
        this.schedulerLogs = schedulerLogs;
        this.taskLogs = taskLogs;
        this.webserverLogs = webserverLogs;
        this.workerLogs = workerLogs;
    }

    private EnvironmentLoggingConfiguration() {
        this.dagProcessingLogs = null;
        this.schedulerLogs = null;
        this.taskLogs = null;
        this.webserverLogs = null;
        this.workerLogs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration taskLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration webserverLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration workerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagProcessingLogs = defaults.dagProcessingLogs;
    	      this.schedulerLogs = defaults.schedulerLogs;
    	      this.taskLogs = defaults.taskLogs;
    	      this.webserverLogs = defaults.webserverLogs;
    	      this.workerLogs = defaults.workerLogs;
        }

        public Builder setDagProcessingLogs(@Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs) {
            this.dagProcessingLogs = dagProcessingLogs;
            return this;
        }

        public Builder setSchedulerLogs(@Nullable EnvironmentModuleLoggingConfiguration schedulerLogs) {
            this.schedulerLogs = schedulerLogs;
            return this;
        }

        public Builder setTaskLogs(@Nullable EnvironmentModuleLoggingConfiguration taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }

        public Builder setWebserverLogs(@Nullable EnvironmentModuleLoggingConfiguration webserverLogs) {
            this.webserverLogs = webserverLogs;
            return this;
        }

        public Builder setWorkerLogs(@Nullable EnvironmentModuleLoggingConfiguration workerLogs) {
            this.workerLogs = workerLogs;
            return this;
        }
        public EnvironmentLoggingConfiguration build() {
            return new EnvironmentLoggingConfiguration(dagProcessingLogs, schedulerLogs, taskLogs, webserverLogs, workerLogs);
        }
    }
}
