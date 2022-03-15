// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps")
      private final @Nullable Output<Boolean> pullDeps;

    public Output<Boolean> getPullDeps() {
        return this.pullDeps == null ? Output.empty() : this.pullDeps;
    }

    /**
     * Required. An rpm package.
     * 
     */
    @Import(name="source", required=true)
      private final Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs> source;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs> getSource() {
        return this.source;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs(
        @Nullable Output<Boolean> pullDeps,
        Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs> source) {
        this.pullDeps = pullDeps;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs() {
        this.pullDeps = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> pullDeps;
        private Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }

        public Builder pullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = Output.ofNullable(pullDeps);
            return this;
        }

        public Builder source(Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGetArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs(pullDeps, source);
        }
    }
}
