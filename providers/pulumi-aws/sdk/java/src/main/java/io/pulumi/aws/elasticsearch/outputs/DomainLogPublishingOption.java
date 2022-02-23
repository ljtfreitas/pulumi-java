// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainLogPublishingOption {
    /**
     * ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    private final String cloudwatchLogGroupArn;
    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor({"cloudwatchLogGroupArn","enabled","logType"})
    private DomainLogPublishingOption(
        String cloudwatchLogGroupArn,
        @Nullable Boolean enabled,
        String logType) {
        this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
        this.enabled = enabled;
        this.logType = Objects.requireNonNull(logType);
    }

    /**
     * ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    public String getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }
    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainLogPublishingOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudwatchLogGroupArn;
        private @Nullable Boolean enabled;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainLogPublishingOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logType = defaults.logType;
        }

        public Builder setCloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public DomainLogPublishingOption build() {
            return new DomainLogPublishingOption(cloudwatchLogGroupArn, enabled, logType);
        }
    }
}
