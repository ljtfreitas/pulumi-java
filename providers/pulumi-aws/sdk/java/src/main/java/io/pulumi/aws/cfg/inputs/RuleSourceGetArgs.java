// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.RuleSourceSourceDetailGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleSourceGetArgs Empty = new RuleSourceGetArgs();

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
     * 
     */
    @Import(name="owner", required=true)
      private final Output<String> owner;

    public Output<String> getOwner() {
        return this.owner;
    }

    /**
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
     * 
     */
    @Import(name="sourceDetails")
      private final @Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails;

    public Output<List<RuleSourceSourceDetailGetArgs>> getSourceDetails() {
        return this.sourceDetails == null ? Output.empty() : this.sourceDetails;
    }

    /**
     * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    @Import(name="sourceIdentifier", required=true)
      private final Output<String> sourceIdentifier;

    public Output<String> getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public RuleSourceGetArgs(
        Output<String> owner,
        @Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails,
        Output<String> sourceIdentifier) {
        this.owner = Objects.requireNonNull(owner, "expected parameter 'owner' to be non-null");
        this.sourceDetails = sourceDetails;
        this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier, "expected parameter 'sourceIdentifier' to be non-null");
    }

    private RuleSourceGetArgs() {
        this.owner = Output.empty();
        this.sourceDetails = Output.empty();
        this.sourceIdentifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> owner;
        private @Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails;
        private Output<String> sourceIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
    	      this.sourceDetails = defaults.sourceDetails;
    	      this.sourceIdentifier = defaults.sourceIdentifier;
        }

        public Builder owner(Output<String> owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder owner(String owner) {
            this.owner = Output.of(Objects.requireNonNull(owner));
            return this;
        }

        public Builder sourceDetails(@Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }

        public Builder sourceDetails(@Nullable List<RuleSourceSourceDetailGetArgs> sourceDetails) {
            this.sourceDetails = Output.ofNullable(sourceDetails);
            return this;
        }

        public Builder sourceIdentifier(Output<String> sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }

        public Builder sourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Output.of(Objects.requireNonNull(sourceIdentifier));
            return this;
        }
        public RuleSourceGetArgs build() {
            return new RuleSourceGetArgs(owner, sourceDetails, sourceIdentifier);
        }
    }
}
