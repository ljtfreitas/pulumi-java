// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information specifying an Anthos Cluster.
 * 
 */
public final class AnthosClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnthosClusterArgs Empty = new AnthosClusterArgs();

    /**
     * Membership of the GKE Hub registered cluster that the Skaffold configuration should be applied to. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
     * 
     */
    @Import(name="membership")
      private final @Nullable Output<String> membership;

    public Output<String> getMembership() {
        return this.membership == null ? Output.empty() : this.membership;
    }

    public AnthosClusterArgs(@Nullable Output<String> membership) {
        this.membership = membership;
    }

    private AnthosClusterArgs() {
        this.membership = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnthosClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> membership;

        public Builder() {
    	      // Empty
        }

        public Builder(AnthosClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membership = defaults.membership;
        }

        public Builder membership(@Nullable Output<String> membership) {
            this.membership = membership;
            return this;
        }

        public Builder membership(@Nullable String membership) {
            this.membership = Output.ofNullable(membership);
            return this;
        }
        public AnthosClusterArgs build() {
            return new AnthosClusterArgs(membership);
        }
    }
}
