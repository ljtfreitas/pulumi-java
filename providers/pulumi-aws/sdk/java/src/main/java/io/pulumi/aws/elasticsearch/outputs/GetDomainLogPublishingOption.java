// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainLogPublishingOption {
    /**
     * The CloudWatch Log Group where the logs are published.
     * 
     */
    private final String cloudwatchLogGroupArn;
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The type of Elasticsearch log being published.
     * 
     */
    private final String logType;

    @CustomType.Constructor
    private GetDomainLogPublishingOption(
        @CustomType.Parameter("cloudwatchLogGroupArn") String cloudwatchLogGroupArn,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("logType") String logType) {
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.enabled = enabled;
        this.logType = logType;
    }

    /**
     * The CloudWatch Log Group where the logs are published.
     * 
    */
    public String getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }
    /**
     * Whether node to node encryption is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The type of Elasticsearch log being published.
     * 
    */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainLogPublishingOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudwatchLogGroupArn;
        private Boolean enabled;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainLogPublishingOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logType = defaults.logType;
        }

        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public GetDomainLogPublishingOption build() {
            return new GetDomainLogPublishingOption(cloudwatchLogGroupArn, enabled, logType);
        }
    }
}
