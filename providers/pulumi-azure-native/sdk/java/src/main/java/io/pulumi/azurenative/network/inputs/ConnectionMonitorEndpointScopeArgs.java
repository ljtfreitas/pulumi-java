// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointScopeItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint scope.
 * 
 */
public final class ConnectionMonitorEndpointScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointScopeArgs Empty = new ConnectionMonitorEndpointScopeArgs();

    /**
     * List of items which needs to be excluded from the endpoint scope.
     * 
     */
    @InputImport(name="exclude")
    private final @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> exclude;

    public Input<List<ConnectionMonitorEndpointScopeItemArgs>> getExclude() {
        return this.exclude == null ? Input.empty() : this.exclude;
    }

    /**
     * List of items which needs to be included to the endpoint scope.
     * 
     */
    @InputImport(name="include")
    private final @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> include;

    public Input<List<ConnectionMonitorEndpointScopeItemArgs>> getInclude() {
        return this.include == null ? Input.empty() : this.include;
    }

    public ConnectionMonitorEndpointScopeArgs(
        @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> exclude,
        @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> include) {
        this.exclude = exclude;
        this.include = include;
    }

    private ConnectionMonitorEndpointScopeArgs() {
        this.exclude = Input.empty();
        this.include = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> exclude;
        private @Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> include;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclude = defaults.exclude;
    	      this.include = defaults.include;
        }

        public Builder setExclude(@Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> exclude) {
            this.exclude = exclude;
            return this;
        }

        public Builder setExclude(@Nullable List<ConnectionMonitorEndpointScopeItemArgs> exclude) {
            this.exclude = Input.ofNullable(exclude);
            return this;
        }

        public Builder setInclude(@Nullable Input<List<ConnectionMonitorEndpointScopeItemArgs>> include) {
            this.include = include;
            return this;
        }

        public Builder setInclude(@Nullable List<ConnectionMonitorEndpointScopeItemArgs> include) {
            this.include = Input.ofNullable(include);
            return this;
        }

        public ConnectionMonitorEndpointScopeArgs build() {
            return new ConnectionMonitorEndpointScopeArgs(exclude, include);
        }
    }
}
