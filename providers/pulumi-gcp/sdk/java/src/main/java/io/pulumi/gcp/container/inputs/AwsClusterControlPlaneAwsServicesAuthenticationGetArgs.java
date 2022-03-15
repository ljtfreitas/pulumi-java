// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneAwsServicesAuthenticationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneAwsServicesAuthenticationGetArgs Empty = new AwsClusterControlPlaneAwsServicesAuthenticationGetArgs();

    /**
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    @Import(name="roleSessionName")
      private final @Nullable Output<String> roleSessionName;

    public Output<String> getRoleSessionName() {
        return this.roleSessionName == null ? Output.empty() : this.roleSessionName;
    }

    public AwsClusterControlPlaneAwsServicesAuthenticationGetArgs(
        Output<String> roleArn,
        @Nullable Output<String> roleSessionName) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.roleSessionName = roleSessionName;
    }

    private AwsClusterControlPlaneAwsServicesAuthenticationGetArgs() {
        this.roleArn = Output.empty();
        this.roleSessionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneAwsServicesAuthenticationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> roleArn;
        private @Nullable Output<String> roleSessionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneAwsServicesAuthenticationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleSessionName = defaults.roleSessionName;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder roleSessionName(@Nullable Output<String> roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }

        public Builder roleSessionName(@Nullable String roleSessionName) {
            this.roleSessionName = Output.ofNullable(roleSessionName);
            return this;
        }
        public AwsClusterControlPlaneAwsServicesAuthenticationGetArgs build() {
            return new AwsClusterControlPlaneAwsServicesAuthenticationGetArgs(roleArn, roleSessionName);
        }
    }
}
