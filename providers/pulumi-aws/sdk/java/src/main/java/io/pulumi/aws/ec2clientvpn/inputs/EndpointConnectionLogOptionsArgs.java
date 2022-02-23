// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2clientvpn.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConnectionLogOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConnectionLogOptionsArgs Empty = new EndpointConnectionLogOptionsArgs();

    /**
     * The name of the CloudWatch Logs log group.
     * 
     */
    @InputImport(name="cloudwatchLogGroup")
    private final @Nullable Input<String> cloudwatchLogGroup;

    public Input<String> getCloudwatchLogGroup() {
        return this.cloudwatchLogGroup == null ? Input.empty() : this.cloudwatchLogGroup;
    }

    /**
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     * 
     */
    @InputImport(name="cloudwatchLogStream")
    private final @Nullable Input<String> cloudwatchLogStream;

    public Input<String> getCloudwatchLogStream() {
        return this.cloudwatchLogStream == null ? Input.empty() : this.cloudwatchLogStream;
    }

    /**
     * Indicates whether connection logging is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public EndpointConnectionLogOptionsArgs(
        @Nullable Input<String> cloudwatchLogGroup,
        @Nullable Input<String> cloudwatchLogStream,
        Input<Boolean> enabled) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
        this.cloudwatchLogStream = cloudwatchLogStream;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private EndpointConnectionLogOptionsArgs() {
        this.cloudwatchLogGroup = Input.empty();
        this.cloudwatchLogStream = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConnectionLogOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudwatchLogGroup;
        private @Nullable Input<String> cloudwatchLogStream;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConnectionLogOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroup = defaults.cloudwatchLogGroup;
    	      this.cloudwatchLogStream = defaults.cloudwatchLogStream;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCloudwatchLogGroup(@Nullable Input<String> cloudwatchLogGroup) {
            this.cloudwatchLogGroup = cloudwatchLogGroup;
            return this;
        }

        public Builder setCloudwatchLogGroup(@Nullable String cloudwatchLogGroup) {
            this.cloudwatchLogGroup = Input.ofNullable(cloudwatchLogGroup);
            return this;
        }

        public Builder setCloudwatchLogStream(@Nullable Input<String> cloudwatchLogStream) {
            this.cloudwatchLogStream = cloudwatchLogStream;
            return this;
        }

        public Builder setCloudwatchLogStream(@Nullable String cloudwatchLogStream) {
            this.cloudwatchLogStream = Input.ofNullable(cloudwatchLogStream);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }
        public EndpointConnectionLogOptionsArgs build() {
            return new EndpointConnectionLogOptionsArgs(cloudwatchLogGroup, cloudwatchLogStream, enabled);
        }
    }
}