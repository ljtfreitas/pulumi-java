// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterServerSideEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterServerSideEncryptionGetArgs Empty = new ClusterServerSideEncryptionGetArgs();

    /**
     * Whether to enable encryption at rest. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public ClusterServerSideEncryptionGetArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ClusterServerSideEncryptionGetArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServerSideEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterServerSideEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public ClusterServerSideEncryptionGetArgs build() {
            return new ClusterServerSideEncryptionGetArgs(enabled);
        }
    }
}
