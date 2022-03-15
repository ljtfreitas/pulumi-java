// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VmwareSourceDetails message describes a specific source details for the vmware source type.
 * 
 */
public final class VmwareSourceDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmwareSourceDetailsResponse Empty = new VmwareSourceDetailsResponse();

    /**
     * Input only. The credentials password. This is write only and can not be read in a GET operation.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * The thumbprint representing the certificate for the vcenter.
     * 
     */
    @Import(name="thumbprint", required=true)
      private final String thumbprint;

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * The credentials username.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    /**
     * The ip address of the vcenter this Source represents.
     * 
     */
    @Import(name="vcenterIp", required=true)
      private final String vcenterIp;

    public String getVcenterIp() {
        return this.vcenterIp;
    }

    public VmwareSourceDetailsResponse(
        String password,
        String thumbprint,
        String username,
        String vcenterIp) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
        this.vcenterIp = Objects.requireNonNull(vcenterIp, "expected parameter 'vcenterIp' to be non-null");
    }

    private VmwareSourceDetailsResponse() {
        this.password = null;
        this.thumbprint = null;
        this.username = null;
        this.vcenterIp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareSourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String thumbprint;
        private String username;
        private String vcenterIp;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareSourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.thumbprint = defaults.thumbprint;
    	      this.username = defaults.username;
    	      this.vcenterIp = defaults.vcenterIp;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder vcenterIp(String vcenterIp) {
            this.vcenterIp = Objects.requireNonNull(vcenterIp);
            return this;
        }
        public VmwareSourceDetailsResponse build() {
            return new VmwareSourceDetailsResponse(password, thumbprint, username, vcenterIp);
        }
    }
}
