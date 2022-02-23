// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VmwareSourceDetails message describes a specific source details for the vmware source type.
 * 
 */
public final class VmwareSourceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmwareSourceDetailsArgs Empty = new VmwareSourceDetailsArgs();

    /**
     * Input only. The credentials password. This is write only and can not be read in a GET operation.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The thumbprint representing the certificate for the vcenter.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    /**
     * The credentials username.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    /**
     * The ip address of the vcenter this Source represents.
     * 
     */
    @InputImport(name="vcenterIp")
      private final @Nullable Input<String> vcenterIp;

    public Input<String> getVcenterIp() {
        return this.vcenterIp == null ? Input.empty() : this.vcenterIp;
    }

    public VmwareSourceDetailsArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> thumbprint,
        @Nullable Input<String> username,
        @Nullable Input<String> vcenterIp) {
        this.password = password;
        this.thumbprint = thumbprint;
        this.username = username;
        this.vcenterIp = vcenterIp;
    }

    private VmwareSourceDetailsArgs() {
        this.password = Input.empty();
        this.thumbprint = Input.empty();
        this.username = Input.empty();
        this.vcenterIp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareSourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> thumbprint;
        private @Nullable Input<String> username;
        private @Nullable Input<String> vcenterIp;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareSourceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.thumbprint = defaults.thumbprint;
    	      this.username = defaults.username;
    	      this.vcenterIp = defaults.vcenterIp;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public Builder setVcenterIp(@Nullable Input<String> vcenterIp) {
            this.vcenterIp = vcenterIp;
            return this;
        }

        public Builder setVcenterIp(@Nullable String vcenterIp) {
            this.vcenterIp = Input.ofNullable(vcenterIp);
            return this;
        }
        public VmwareSourceDetailsArgs build() {
            return new VmwareSourceDetailsArgs(password, thumbprint, username, vcenterIp);
        }
    }
}
