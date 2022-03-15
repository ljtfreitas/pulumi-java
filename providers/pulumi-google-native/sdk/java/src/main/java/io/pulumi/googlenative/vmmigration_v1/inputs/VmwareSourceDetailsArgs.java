// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The thumbprint representing the certificate for the vcenter.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint == null ? Output.empty() : this.thumbprint;
    }

    /**
     * The credentials username.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    /**
     * The ip address of the vcenter this Source represents.
     * 
     */
    @Import(name="vcenterIp")
      private final @Nullable Output<String> vcenterIp;

    public Output<String> getVcenterIp() {
        return this.vcenterIp == null ? Output.empty() : this.vcenterIp;
    }

    public VmwareSourceDetailsArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> thumbprint,
        @Nullable Output<String> username,
        @Nullable Output<String> vcenterIp) {
        this.password = password;
        this.thumbprint = thumbprint;
        this.username = username;
        this.vcenterIp = vcenterIp;
    }

    private VmwareSourceDetailsArgs() {
        this.password = Output.empty();
        this.thumbprint = Output.empty();
        this.username = Output.empty();
        this.vcenterIp = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareSourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> thumbprint;
        private @Nullable Output<String> username;
        private @Nullable Output<String> vcenterIp;

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

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Output.ofNullable(thumbprint);
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }

        public Builder vcenterIp(@Nullable Output<String> vcenterIp) {
            this.vcenterIp = vcenterIp;
            return this;
        }

        public Builder vcenterIp(@Nullable String vcenterIp) {
            this.vcenterIp = Output.ofNullable(vcenterIp);
            return this;
        }
        public VmwareSourceDetailsArgs build() {
            return new VmwareSourceDetailsArgs(password, thumbprint, username, vcenterIp);
        }
    }
}
