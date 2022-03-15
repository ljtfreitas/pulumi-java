// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceAPTResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceDebResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceGooGetResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceMSIResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceRPMResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceYUMResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceZypperResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A resource that manages a system package.
 * 
 */
public final class OSPolicyResourcePackageResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceResponse Empty = new OSPolicyResourcePackageResourceResponse();

    /**
     * A package managed by Apt.
     * 
     */
    @Import(name="apt", required=true)
      private final OSPolicyResourcePackageResourceAPTResponse apt;

    public OSPolicyResourcePackageResourceAPTResponse getApt() {
        return this.apt;
    }

    /**
     * A deb package file.
     * 
     */
    @Import(name="deb", required=true)
      private final OSPolicyResourcePackageResourceDebResponse deb;

    public OSPolicyResourcePackageResourceDebResponse getDeb() {
        return this.deb;
    }

    /**
     * The desired state the agent should maintain for this package.
     * 
     */
    @Import(name="desiredState", required=true)
      private final String desiredState;

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @Import(name="googet", required=true)
      private final OSPolicyResourcePackageResourceGooGetResponse googet;

    public OSPolicyResourcePackageResourceGooGetResponse getGooget() {
        return this.googet;
    }

    /**
     * An MSI package.
     * 
     */
    @Import(name="msi", required=true)
      private final OSPolicyResourcePackageResourceMSIResponse msi;

    public OSPolicyResourcePackageResourceMSIResponse getMsi() {
        return this.msi;
    }

    /**
     * An rpm package file.
     * 
     */
    @Import(name="rpm", required=true)
      private final OSPolicyResourcePackageResourceRPMResponse rpm;

    public OSPolicyResourcePackageResourceRPMResponse getRpm() {
        return this.rpm;
    }

    /**
     * A package managed by YUM.
     * 
     */
    @Import(name="yum", required=true)
      private final OSPolicyResourcePackageResourceYUMResponse yum;

    public OSPolicyResourcePackageResourceYUMResponse getYum() {
        return this.yum;
    }

    /**
     * A package managed by Zypper.
     * 
     */
    @Import(name="zypper", required=true)
      private final OSPolicyResourcePackageResourceZypperResponse zypper;

    public OSPolicyResourcePackageResourceZypperResponse getZypper() {
        return this.zypper;
    }

    public OSPolicyResourcePackageResourceResponse(
        OSPolicyResourcePackageResourceAPTResponse apt,
        OSPolicyResourcePackageResourceDebResponse deb,
        String desiredState,
        OSPolicyResourcePackageResourceGooGetResponse googet,
        OSPolicyResourcePackageResourceMSIResponse msi,
        OSPolicyResourcePackageResourceRPMResponse rpm,
        OSPolicyResourcePackageResourceYUMResponse yum,
        OSPolicyResourcePackageResourceZypperResponse zypper) {
        this.apt = Objects.requireNonNull(apt, "expected parameter 'apt' to be non-null");
        this.deb = Objects.requireNonNull(deb, "expected parameter 'deb' to be non-null");
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.googet = Objects.requireNonNull(googet, "expected parameter 'googet' to be non-null");
        this.msi = Objects.requireNonNull(msi, "expected parameter 'msi' to be non-null");
        this.rpm = Objects.requireNonNull(rpm, "expected parameter 'rpm' to be non-null");
        this.yum = Objects.requireNonNull(yum, "expected parameter 'yum' to be non-null");
        this.zypper = Objects.requireNonNull(zypper, "expected parameter 'zypper' to be non-null");
    }

    private OSPolicyResourcePackageResourceResponse() {
        this.apt = null;
        this.deb = null;
        this.desiredState = null;
        this.googet = null;
        this.msi = null;
        this.rpm = null;
        this.yum = null;
        this.zypper = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceAPTResponse apt;
        private OSPolicyResourcePackageResourceDebResponse deb;
        private String desiredState;
        private OSPolicyResourcePackageResourceGooGetResponse googet;
        private OSPolicyResourcePackageResourceMSIResponse msi;
        private OSPolicyResourcePackageResourceRPMResponse rpm;
        private OSPolicyResourcePackageResourceYUMResponse yum;
        private OSPolicyResourcePackageResourceZypperResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(OSPolicyResourcePackageResourceAPTResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }

        public Builder deb(OSPolicyResourcePackageResourceDebResponse deb) {
            this.deb = Objects.requireNonNull(deb);
            return this;
        }

        public Builder desiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder googet(OSPolicyResourcePackageResourceGooGetResponse googet) {
            this.googet = Objects.requireNonNull(googet);
            return this;
        }

        public Builder msi(OSPolicyResourcePackageResourceMSIResponse msi) {
            this.msi = Objects.requireNonNull(msi);
            return this;
        }

        public Builder rpm(OSPolicyResourcePackageResourceRPMResponse rpm) {
            this.rpm = Objects.requireNonNull(rpm);
            return this;
        }

        public Builder yum(OSPolicyResourcePackageResourceYUMResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }

        public Builder zypper(OSPolicyResourcePackageResourceZypperResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }
        public OSPolicyResourcePackageResourceResponse build() {
            return new OSPolicyResourcePackageResourceResponse(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
