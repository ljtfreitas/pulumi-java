// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters, to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
 * 
 */
public final class MitigationActionPublishFindingToSnsParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionPublishFindingToSnsParamsArgs Empty = new MitigationActionPublishFindingToSnsParamsArgs();

    /**
     * The ARN of the topic to which you want to publish the findings.
     * 
     */
    @Import(name="topicArn", required=true)
      private final Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn;
    }

    public MitigationActionPublishFindingToSnsParamsArgs(Output<String> topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private MitigationActionPublishFindingToSnsParamsArgs() {
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionPublishFindingToSnsParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionPublishFindingToSnsParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder topicArn(Output<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }

        public Builder topicArn(String topicArn) {
            this.topicArn = Output.of(Objects.requireNonNull(topicArn));
            return this;
        }
        public MitigationActionPublishFindingToSnsParamsArgs build() {
            return new MitigationActionPublishFindingToSnsParamsArgs(topicArn);
        }
    }
}
