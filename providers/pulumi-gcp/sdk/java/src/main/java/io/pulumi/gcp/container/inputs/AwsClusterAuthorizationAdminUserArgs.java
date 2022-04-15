// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterAuthorizationAdminUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterAuthorizationAdminUserArgs Empty = new AwsClusterAuthorizationAdminUserArgs();

    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public AwsClusterAuthorizationAdminUserArgs(Output<String> username) {
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private AwsClusterAuthorizationAdminUserArgs() {
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterAuthorizationAdminUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterAuthorizationAdminUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public AwsClusterAuthorizationAdminUserArgs build() {
            return new AwsClusterAuthorizationAdminUserArgs(username);
        }
    }
}
