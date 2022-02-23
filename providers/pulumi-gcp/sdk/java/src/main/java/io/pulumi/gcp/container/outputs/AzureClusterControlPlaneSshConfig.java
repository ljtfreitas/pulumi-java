// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureClusterControlPlaneSshConfig {
    /**
     * Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    private final String authorizedKey;

    @OutputCustomType.Constructor({"authorizedKey"})
    private AzureClusterControlPlaneSshConfig(String authorizedKey) {
        this.authorizedKey = Objects.requireNonNull(authorizedKey);
    }

    /**
     * Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    public String getAuthorizedKey() {
        return this.authorizedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneSshConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneSshConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedKey = defaults.authorizedKey;
        }

        public Builder setAuthorizedKey(String authorizedKey) {
            this.authorizedKey = Objects.requireNonNull(authorizedKey);
            return this;
        }
        public AzureClusterControlPlaneSshConfig build() {
            return new AzureClusterControlPlaneSshConfig(authorizedKey);
        }
    }
}
