// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SystemAssignedIdentityAuthInfoResponse {
    /**
     * The authentication type.
     * Expected value is 'systemAssignedIdentity'.
     * 
     */
    private final String authType;

    @OutputCustomType.Constructor({"authType"})
    private SystemAssignedIdentityAuthInfoResponse(String authType) {
        this.authType = Objects.requireNonNull(authType);
    }

    /**
     * The authentication type.
     * Expected value is 'systemAssignedIdentity'.
     * 
     */
    public String getAuthType() {
        return this.authType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemAssignedIdentityAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemAssignedIdentityAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
        }

        public Builder setAuthType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public SystemAssignedIdentityAuthInfoResponse build() {
            return new SystemAssignedIdentityAuthInfoResponse(authType);
        }
    }
}
