// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OSPolicyResourcePackageResourceRPMResponse {
    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    private final Boolean pullDeps;
    /**
     * An rpm package.
     * 
     */
    private final OSPolicyResourceFileResponse source;

    @CustomType.Constructor
    private OSPolicyResourcePackageResourceRPMResponse(
        @CustomType.Parameter("pullDeps") Boolean pullDeps,
        @CustomType.Parameter("source") OSPolicyResourceFileResponse source) {
        this.pullDeps = pullDeps;
        this.source = source;
    }

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
    */
    public Boolean getPullDeps() {
        return this.pullDeps;
    }
    /**
     * An rpm package.
     * 
    */
    public OSPolicyResourceFileResponse getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean pullDeps;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(Boolean pullDeps) {
            this.pullDeps = Objects.requireNonNull(pullDeps);
            return this;
        }

        public Builder source(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public OSPolicyResourcePackageResourceRPMResponse build() {
            return new OSPolicyResourcePackageResourceRPMResponse(pullDeps, source);
        }
    }
}
