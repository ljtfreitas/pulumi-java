// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentTargetState extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentTargetState Empty = new AssessmentTargetState();

    /**
     * The target assessment ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of the assessment target.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    @Import(name="resourceGroupArn")
      private final @Nullable Output<String> resourceGroupArn;

    public Output<String> getResourceGroupArn() {
        return this.resourceGroupArn == null ? Output.empty() : this.resourceGroupArn;
    }

    public AssessmentTargetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<String> resourceGroupArn) {
        this.arn = arn;
        this.name = name;
        this.resourceGroupArn = resourceGroupArn;
    }

    private AssessmentTargetState() {
        this.arn = Output.empty();
        this.name = Output.empty();
        this.resourceGroupArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resourceGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentTargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.resourceGroupArn = defaults.resourceGroupArn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder resourceGroupArn(@Nullable Output<String> resourceGroupArn) {
            this.resourceGroupArn = resourceGroupArn;
            return this;
        }

        public Builder resourceGroupArn(@Nullable String resourceGroupArn) {
            this.resourceGroupArn = Output.ofNullable(resourceGroupArn);
            return this;
        }
        public AssessmentTargetState build() {
            return new AssessmentTargetState(arn, name, resourceGroupArn);
        }
    }
}
