// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies that the scope of the extensionInstance is Cluster
 * 
 */
public final class ScopeClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeClusterArgs Empty = new ScopeClusterArgs();

    /**
     * Namespace where the extension Release must be placed, for a Cluster scoped extensionInstance.  If this namespace does not exist, it will be created
     * 
     */
    @Import(name="releaseNamespace")
      private final @Nullable Output<String> releaseNamespace;

    public Output<String> getReleaseNamespace() {
        return this.releaseNamespace == null ? Output.empty() : this.releaseNamespace;
    }

    public ScopeClusterArgs(@Nullable Output<String> releaseNamespace) {
        this.releaseNamespace = releaseNamespace;
    }

    private ScopeClusterArgs() {
        this.releaseNamespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> releaseNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.releaseNamespace = defaults.releaseNamespace;
        }

        public Builder releaseNamespace(@Nullable Output<String> releaseNamespace) {
            this.releaseNamespace = releaseNamespace;
            return this;
        }

        public Builder releaseNamespace(@Nullable String releaseNamespace) {
            this.releaseNamespace = Output.ofNullable(releaseNamespace);
            return this;
        }
        public ScopeClusterArgs build() {
            return new ScopeClusterArgs(releaseNamespace);
        }
    }
}
