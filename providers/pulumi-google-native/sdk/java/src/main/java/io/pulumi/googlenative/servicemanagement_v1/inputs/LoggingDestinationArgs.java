// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of a specific logging destination (the producer project or the consumer project).
 * 
 */
public final class LoggingDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingDestinationArgs Empty = new LoggingDestinationArgs();

    /**
     * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically prefixed with the service name followed by "/".
     * 
     */
    @Import(name="logs")
      private final @Nullable Output<List<String>> logs;

    public Output<List<String>> getLogs() {
        return this.logs == null ? Output.empty() : this.logs;
    }

    /**
     * The monitored resource type. The type must be defined in the Service.monitored_resources section.
     * 
     */
    @Import(name="monitoredResource")
      private final @Nullable Output<String> monitoredResource;

    public Output<String> getMonitoredResource() {
        return this.monitoredResource == null ? Output.empty() : this.monitoredResource;
    }

    public LoggingDestinationArgs(
        @Nullable Output<List<String>> logs,
        @Nullable Output<String> monitoredResource) {
        this.logs = logs;
        this.monitoredResource = monitoredResource;
    }

    private LoggingDestinationArgs() {
        this.logs = Output.empty();
        this.monitoredResource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> logs;
        private @Nullable Output<String> monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder logs(@Nullable Output<List<String>> logs) {
            this.logs = logs;
            return this;
        }

        public Builder logs(@Nullable List<String> logs) {
            this.logs = Output.ofNullable(logs);
            return this;
        }

        public Builder monitoredResource(@Nullable Output<String> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder monitoredResource(@Nullable String monitoredResource) {
            this.monitoredResource = Output.ofNullable(monitoredResource);
            return this;
        }
        public LoggingDestinationArgs build() {
            return new LoggingDestinationArgs(logs, monitoredResource);
        }
    }
}
