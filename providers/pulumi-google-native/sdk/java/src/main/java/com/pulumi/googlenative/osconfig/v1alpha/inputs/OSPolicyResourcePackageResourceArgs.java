// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1alpha.enums.OSPolicyResourcePackageResourceDesiredState;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceAPTArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceDebArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceGooGetArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceMSIArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceRPMArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceYUMArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyResourcePackageResourceZypperArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A resource that manages a system package.
 * 
 */
public final class OSPolicyResourcePackageResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceArgs Empty = new OSPolicyResourcePackageResourceArgs();

    /**
     * A package managed by Apt.
     * 
     */
    @Import(name="apt")
    private @Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt;

    /**
     * @return A package managed by Apt.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceAPTArgs>> apt() {
        return Optional.ofNullable(this.apt);
    }

    /**
     * A deb package file.
     * 
     */
    @Import(name="deb")
    private @Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb;

    /**
     * @return A deb package file.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceDebArgs>> deb() {
        return Optional.ofNullable(this.deb);
    }

    /**
     * The desired state the agent should maintain for this package.
     * 
     */
    @Import(name="desiredState", required=true)
    private Output<OSPolicyResourcePackageResourceDesiredState> desiredState;

    /**
     * @return The desired state the agent should maintain for this package.
     * 
     */
    public Output<OSPolicyResourcePackageResourceDesiredState> desiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @Import(name="googet")
    private @Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet;

    /**
     * @return A package managed by GooGet.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceGooGetArgs>> googet() {
        return Optional.ofNullable(this.googet);
    }

    /**
     * An MSI package.
     * 
     */
    @Import(name="msi")
    private @Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi;

    /**
     * @return An MSI package.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceMSIArgs>> msi() {
        return Optional.ofNullable(this.msi);
    }

    /**
     * An rpm package file.
     * 
     */
    @Import(name="rpm")
    private @Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm;

    /**
     * @return An rpm package file.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceRPMArgs>> rpm() {
        return Optional.ofNullable(this.rpm);
    }

    /**
     * A package managed by YUM.
     * 
     */
    @Import(name="yum")
    private @Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum;

    /**
     * @return A package managed by YUM.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceYUMArgs>> yum() {
        return Optional.ofNullable(this.yum);
    }

    /**
     * A package managed by Zypper.
     * 
     */
    @Import(name="zypper")
    private @Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper;

    /**
     * @return A package managed by Zypper.
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceZypperArgs>> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    private OSPolicyResourcePackageResourceArgs() {}

    private OSPolicyResourcePackageResourceArgs(OSPolicyResourcePackageResourceArgs $) {
        this.apt = $.apt;
        this.deb = $.deb;
        this.desiredState = $.desiredState;
        this.googet = $.googet;
        this.msi = $.msi;
        this.rpm = $.rpm;
        this.yum = $.yum;
        this.zypper = $.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceArgs();
        }

        public Builder(OSPolicyResourcePackageResourceArgs defaults) {
            $ = new OSPolicyResourcePackageResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apt A package managed by Apt.
         * 
         * @return builder
         * 
         */
        public Builder apt(@Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt) {
            $.apt = apt;
            return this;
        }

        /**
         * @param apt A package managed by Apt.
         * 
         * @return builder
         * 
         */
        public Builder apt(OSPolicyResourcePackageResourceAPTArgs apt) {
            return apt(Output.of(apt));
        }

        /**
         * @param deb A deb package file.
         * 
         * @return builder
         * 
         */
        public Builder deb(@Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb) {
            $.deb = deb;
            return this;
        }

        /**
         * @param deb A deb package file.
         * 
         * @return builder
         * 
         */
        public Builder deb(OSPolicyResourcePackageResourceDebArgs deb) {
            return deb(Output.of(deb));
        }

        /**
         * @param desiredState The desired state the agent should maintain for this package.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(Output<OSPolicyResourcePackageResourceDesiredState> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        /**
         * @param desiredState The desired state the agent should maintain for this package.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(OSPolicyResourcePackageResourceDesiredState desiredState) {
            return desiredState(Output.of(desiredState));
        }

        /**
         * @param googet A package managed by GooGet.
         * 
         * @return builder
         * 
         */
        public Builder googet(@Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet) {
            $.googet = googet;
            return this;
        }

        /**
         * @param googet A package managed by GooGet.
         * 
         * @return builder
         * 
         */
        public Builder googet(OSPolicyResourcePackageResourceGooGetArgs googet) {
            return googet(Output.of(googet));
        }

        /**
         * @param msi An MSI package.
         * 
         * @return builder
         * 
         */
        public Builder msi(@Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi) {
            $.msi = msi;
            return this;
        }

        /**
         * @param msi An MSI package.
         * 
         * @return builder
         * 
         */
        public Builder msi(OSPolicyResourcePackageResourceMSIArgs msi) {
            return msi(Output.of(msi));
        }

        /**
         * @param rpm An rpm package file.
         * 
         * @return builder
         * 
         */
        public Builder rpm(@Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm) {
            $.rpm = rpm;
            return this;
        }

        /**
         * @param rpm An rpm package file.
         * 
         * @return builder
         * 
         */
        public Builder rpm(OSPolicyResourcePackageResourceRPMArgs rpm) {
            return rpm(Output.of(rpm));
        }

        /**
         * @param yum A package managed by YUM.
         * 
         * @return builder
         * 
         */
        public Builder yum(@Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum) {
            $.yum = yum;
            return this;
        }

        /**
         * @param yum A package managed by YUM.
         * 
         * @return builder
         * 
         */
        public Builder yum(OSPolicyResourcePackageResourceYUMArgs yum) {
            return yum(Output.of(yum));
        }

        /**
         * @param zypper A package managed by Zypper.
         * 
         * @return builder
         * 
         */
        public Builder zypper(@Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper) {
            $.zypper = zypper;
            return this;
        }

        /**
         * @param zypper A package managed by Zypper.
         * 
         * @return builder
         * 
         */
        public Builder zypper(OSPolicyResourcePackageResourceZypperArgs zypper) {
            return zypper(Output.of(zypper));
        }

        public OSPolicyResourcePackageResourceArgs build() {
            $.desiredState = Objects.requireNonNull($.desiredState, "expected parameter 'desiredState' to be non-null");
            return $;
        }
    }

}
