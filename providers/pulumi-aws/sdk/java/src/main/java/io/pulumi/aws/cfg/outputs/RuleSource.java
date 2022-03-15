// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.aws.cfg.outputs.RuleSourceSourceDetail;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleSource {
    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
     * 
     */
    private final String owner;
    /**
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
     * 
     */
    private final @Nullable List<RuleSourceSourceDetail> sourceDetails;
    /**
     * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    private final String sourceIdentifier;

    @CustomType.Constructor
    private RuleSource(
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("sourceDetails") @Nullable List<RuleSourceSourceDetail> sourceDetails,
        @CustomType.Parameter("sourceIdentifier") String sourceIdentifier) {
        this.owner = owner;
        this.sourceDetails = sourceDetails;
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
     * 
    */
    public String getOwner() {
        return this.owner;
    }
    /**
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
     * 
    */
    public List<RuleSourceSourceDetail> getSourceDetails() {
        return this.sourceDetails == null ? List.of() : this.sourceDetails;
    }
    /**
     * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
    */
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String owner;
        private @Nullable List<RuleSourceSourceDetail> sourceDetails;
        private String sourceIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
    	      this.sourceDetails = defaults.sourceDetails;
    	      this.sourceIdentifier = defaults.sourceIdentifier;
        }

        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder sourceDetails(@Nullable List<RuleSourceSourceDetail> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }

        public Builder sourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }
        public RuleSource build() {
            return new RuleSource(owner, sourceDetails, sourceIdentifier);
        }
    }
}
