// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor test group.
 * 
 */
public final class ConnectionMonitorTestGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorTestGroupResponse Empty = new ConnectionMonitorTestGroupResponse();

    /**
     * List of destination endpoint names.
     * 
     */
    @InputImport(name="destinations", required=true)
    private final List<String> destinations;

    public List<String> getDestinations() {
        return this.destinations;
    }

    /**
     * Value indicating whether test group is disabled.
     * 
     */
    @InputImport(name="disable")
    private final @Nullable Boolean disable;

    public Optional<Boolean> getDisable() {
        return this.disable == null ? Optional.empty() : Optional.ofNullable(this.disable);
    }

    /**
     * The name of the connection monitor test group.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * List of source endpoint names.
     * 
     */
    @InputImport(name="sources", required=true)
    private final List<String> sources;

    public List<String> getSources() {
        return this.sources;
    }

    /**
     * List of test configuration names.
     * 
     */
    @InputImport(name="testConfigurations", required=true)
    private final List<String> testConfigurations;

    public List<String> getTestConfigurations() {
        return this.testConfigurations;
    }

    public ConnectionMonitorTestGroupResponse(
        List<String> destinations,
        @Nullable Boolean disable,
        String name,
        List<String> sources,
        List<String> testConfigurations) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.disable = disable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
        this.testConfigurations = Objects.requireNonNull(testConfigurations, "expected parameter 'testConfigurations' to be non-null");
    }

    private ConnectionMonitorTestGroupResponse() {
        this.destinations = List.of();
        this.disable = null;
        this.name = null;
        this.sources = List.of();
        this.testConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTestGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destinations;
        private @Nullable Boolean disable;
        private String name;
        private List<String> sources;
        private List<String> testConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTestGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.disable = defaults.disable;
    	      this.name = defaults.name;
    	      this.sources = defaults.sources;
    	      this.testConfigurations = defaults.testConfigurations;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDisable(@Nullable Boolean disable) {
            this.disable = disable;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSources(List<String> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setTestConfigurations(List<String> testConfigurations) {
            this.testConfigurations = Objects.requireNonNull(testConfigurations);
            return this;
        }

        public ConnectionMonitorTestGroupResponse build() {
            return new ConnectionMonitorTestGroupResponse(destinations, disable, name, sources, testConfigurations);
        }
    }
}
