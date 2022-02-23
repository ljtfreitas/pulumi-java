// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryAptArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryGooArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryYumArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryZypperArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryArgs Empty = new GuestPoliciesPackageRepositoryArgs();

    /**
     * An Apt Repository.
     * Structure is documented below.
     * 
     */
    @InputImport(name="apt")
        private final @Nullable Input<GuestPoliciesPackageRepositoryAptArgs> apt;

    public Input<GuestPoliciesPackageRepositoryAptArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * A Goo Repository.
     * Structure is documented below.
     * 
     */
    @InputImport(name="goo")
        private final @Nullable Input<GuestPoliciesPackageRepositoryGooArgs> goo;

    public Input<GuestPoliciesPackageRepositoryGooArgs> getGoo() {
        return this.goo == null ? Input.empty() : this.goo;
    }

    /**
     * A Yum Repository.
     * Structure is documented below.
     * 
     */
    @InputImport(name="yum")
        private final @Nullable Input<GuestPoliciesPackageRepositoryYumArgs> yum;

    public Input<GuestPoliciesPackageRepositoryYumArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * Structure is documented below.
     * 
     */
    @InputImport(name="zypper")
        private final @Nullable Input<GuestPoliciesPackageRepositoryZypperArgs> zypper;

    public Input<GuestPoliciesPackageRepositoryZypperArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public GuestPoliciesPackageRepositoryArgs(
        @Nullable Input<GuestPoliciesPackageRepositoryAptArgs> apt,
        @Nullable Input<GuestPoliciesPackageRepositoryGooArgs> goo,
        @Nullable Input<GuestPoliciesPackageRepositoryYumArgs> yum,
        @Nullable Input<GuestPoliciesPackageRepositoryZypperArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    private GuestPoliciesPackageRepositoryArgs() {
        this.apt = Input.empty();
        this.goo = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestPoliciesPackageRepositoryAptArgs> apt;
        private @Nullable Input<GuestPoliciesPackageRepositoryGooArgs> goo;
        private @Nullable Input<GuestPoliciesPackageRepositoryYumArgs> yum;
        private @Nullable Input<GuestPoliciesPackageRepositoryZypperArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(@Nullable Input<GuestPoliciesPackageRepositoryAptArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder setApt(@Nullable GuestPoliciesPackageRepositoryAptArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder setGoo(@Nullable Input<GuestPoliciesPackageRepositoryGooArgs> goo) {
            this.goo = goo;
            return this;
        }

        public Builder setGoo(@Nullable GuestPoliciesPackageRepositoryGooArgs goo) {
            this.goo = Input.ofNullable(goo);
            return this;
        }

        public Builder setYum(@Nullable Input<GuestPoliciesPackageRepositoryYumArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder setYum(@Nullable GuestPoliciesPackageRepositoryYumArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder setZypper(@Nullable Input<GuestPoliciesPackageRepositoryZypperArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder setZypper(@Nullable GuestPoliciesPackageRepositoryZypperArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }
        public GuestPoliciesPackageRepositoryArgs build() {
            return new GuestPoliciesPackageRepositoryArgs(apt, goo, yum, zypper);
        }
    }
}
