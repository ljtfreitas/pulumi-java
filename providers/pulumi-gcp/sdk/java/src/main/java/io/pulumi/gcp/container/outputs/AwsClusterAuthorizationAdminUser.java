// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsClusterAuthorizationAdminUser {
    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private AwsClusterAuthorizationAdminUser(@CustomType.Parameter("username") String username) {
        this.username = username;
    }

    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterAuthorizationAdminUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterAuthorizationAdminUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public AwsClusterAuthorizationAdminUser build() {
            return new AwsClusterAuthorizationAdminUser(username);
        }
    }
}
