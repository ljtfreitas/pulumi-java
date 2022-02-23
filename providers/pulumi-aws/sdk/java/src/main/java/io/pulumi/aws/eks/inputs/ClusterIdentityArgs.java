// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.ClusterIdentityOidcArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityArgs Empty = new ClusterIdentityArgs();

    /**
     * Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @InputImport(name="oidcs")
    private final @Nullable Input<List<ClusterIdentityOidcArgs>> oidcs;

    public Input<List<ClusterIdentityOidcArgs>> getOidcs() {
        return this.oidcs == null ? Input.empty() : this.oidcs;
    }

    public ClusterIdentityArgs(@Nullable Input<List<ClusterIdentityOidcArgs>> oidcs) {
        this.oidcs = oidcs;
    }

    private ClusterIdentityArgs() {
        this.oidcs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterIdentityOidcArgs>> oidcs;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oidcs = defaults.oidcs;
        }

        public Builder setOidcs(@Nullable Input<List<ClusterIdentityOidcArgs>> oidcs) {
            this.oidcs = oidcs;
            return this;
        }

        public Builder setOidcs(@Nullable List<ClusterIdentityOidcArgs> oidcs) {
            this.oidcs = Input.ofNullable(oidcs);
            return this;
        }
        public ClusterIdentityArgs build() {
            return new ClusterIdentityArgs(oidcs);
        }
    }
}
