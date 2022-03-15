// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * An RPM package file. RPM packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceRPMResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceRPMResponse Empty = new OSPolicyResourcePackageResourceRPMResponse();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps", required=true)
      private final Boolean pullDeps;

    public Boolean getPullDeps() {
        return this.pullDeps;
    }

    /**
     * An rpm package.
     * 
     */
    @Import(name="source", required=true)
      private final OSPolicyResourceFileResponse source;

    public OSPolicyResourceFileResponse getSource() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceRPMResponse(
        Boolean pullDeps,
        OSPolicyResourceFileResponse source) {
        this.pullDeps = Objects.requireNonNull(pullDeps, "expected parameter 'pullDeps' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceRPMResponse() {
        this.pullDeps = null;
        this.source = null;
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
