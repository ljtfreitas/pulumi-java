// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QueryLogArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryLogArgs Empty = new QueryLogArgs();

    /**
     * CloudWatch log group ARN to send query logs.
     * 
     */
    @Import(name="cloudwatchLogGroupArn", required=true)
      private final Output<String> cloudwatchLogGroupArn;

    public Output<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Route53 hosted zone ID to enable query logs.
     * 
     */
    @Import(name="zoneId", required=true)
      private final Output<String> zoneId;

    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public QueryLogArgs(
        Output<String> cloudwatchLogGroupArn,
        Output<String> zoneId) {
        this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
        this.zoneId = Objects.requireNonNull(zoneId, "expected parameter 'zoneId' to be non-null");
    }

    private QueryLogArgs() {
        this.cloudwatchLogGroupArn = Output.empty();
        this.zoneId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudwatchLogGroupArn;
        private Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryLogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder cloudwatchLogGroupArn(Output<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }

        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Output.of(Objects.requireNonNull(cloudwatchLogGroupArn));
            return this;
        }

        public Builder zoneId(Output<String> zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }

        public Builder zoneId(String zoneId) {
            this.zoneId = Output.of(Objects.requireNonNull(zoneId));
            return this;
        }
        public QueryLogArgs build() {
            return new QueryLogArgs(cloudwatchLogGroupArn, zoneId);
        }
    }
}
