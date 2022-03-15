// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm {
    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    private final @Nullable Boolean pullDeps;
    /**
     * Required. An rpm package.
     * 
     */
    private final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource source;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm(
        @CustomType.Parameter("pullDeps") @Nullable Boolean pullDeps,
        @CustomType.Parameter("source") OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource source) {
        this.pullDeps = pullDeps;
        this.source = source;
    }

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
    */
    public Optional<Boolean> getPullDeps() {
        return Optional.ofNullable(this.pullDeps);
    }
    /**
     * Required. An rpm package.
     * 
    */
    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean pullDeps;
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }

        public Builder source(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSource source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm(pullDeps, source);
        }
    }
}
