// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs Empty = new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs();

    /**
     * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     * 
     */
    @InputImport(name="appIdClientRegex")
    private final @Nullable Input<String> appIdClientRegex;

    public Input<String> getAppIdClientRegex() {
        return this.appIdClientRegex == null ? Input.empty() : this.appIdClientRegex;
    }

    /**
     * The AWS region in which the user pool was created.
     * 
     */
    @InputImport(name="awsRegion")
    private final @Nullable Input<String> awsRegion;

    public Input<String> getAwsRegion() {
        return this.awsRegion == null ? Input.empty() : this.awsRegion;
    }

    /**
     * The user pool ID.
     * 
     */
    @InputImport(name="userPoolId", required=true)
    private final Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId;
    }

    public GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs(
        @Nullable Input<String> appIdClientRegex,
        @Nullable Input<String> awsRegion,
        Input<String> userPoolId) {
        this.appIdClientRegex = appIdClientRegex;
        this.awsRegion = awsRegion;
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs() {
        this.appIdClientRegex = Input.empty();
        this.awsRegion = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appIdClientRegex;
        private @Nullable Input<String> awsRegion;
        private Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIdClientRegex = defaults.appIdClientRegex;
    	      this.awsRegion = defaults.awsRegion;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setAppIdClientRegex(@Nullable Input<String> appIdClientRegex) {
            this.appIdClientRegex = appIdClientRegex;
            return this;
        }

        public Builder setAppIdClientRegex(@Nullable String appIdClientRegex) {
            this.appIdClientRegex = Input.ofNullable(appIdClientRegex);
            return this;
        }

        public Builder setAwsRegion(@Nullable Input<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }

        public Builder setAwsRegion(@Nullable String awsRegion) {
            this.awsRegion = Input.ofNullable(awsRegion);
            return this;
        }

        public Builder setUserPoolId(Input<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Input.of(Objects.requireNonNull(userPoolId));
            return this;
        }
        public GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs build() {
            return new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs(appIdClientRegex, awsRegion, userPoolId);
        }
    }
}
