// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainLogPublishingOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainLogPublishingOptionArgs Empty = new DomainLogPublishingOptionArgs();

    /**
     * ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    @InputImport(name="cloudwatchLogGroupArn", required=true)
    private final Input<String> cloudwatchLogGroupArn;

    public Input<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    @InputImport(name="logType", required=true)
    private final Input<String> logType;

    public Input<String> getLogType() {
        return this.logType;
    }

    public DomainLogPublishingOptionArgs(
        Input<String> cloudwatchLogGroupArn,
        @Nullable Input<Boolean> enabled,
        Input<String> logType) {
        this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
        this.enabled = enabled;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private DomainLogPublishingOptionArgs() {
        this.cloudwatchLogGroupArn = Input.empty();
        this.enabled = Input.empty();
        this.logType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainLogPublishingOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloudwatchLogGroupArn;
        private @Nullable Input<Boolean> enabled;
        private Input<String> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainLogPublishingOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logType = defaults.logType;
        }

        public Builder setCloudwatchLogGroupArn(Input<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }

        public Builder setCloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Input.of(Objects.requireNonNull(cloudwatchLogGroupArn));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogType(Input<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Input.of(Objects.requireNonNull(logType));
            return this;
        }
        public DomainLogPublishingOptionArgs build() {
            return new DomainLogPublishingOptionArgs(cloudwatchLogGroupArn, enabled, logType);
        }
    }
}
