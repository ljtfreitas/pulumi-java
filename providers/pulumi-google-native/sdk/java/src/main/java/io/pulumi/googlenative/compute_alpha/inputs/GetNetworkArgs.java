// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNetworkArgs(
        String network,
        @Nullable String project) {
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.project = project;
    }

    private GetNetworkArgs() {
        this.network = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String network;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.project = defaults.project;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetNetworkArgs build() {
            return new GetNetworkArgs(network, project);
        }
    }
}
