// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyState Empty = new ResourcePolicyState();

    /**
     * A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn == null ? Output.empty() : this.resourceArn;
    }

    public ResourcePolicyState(
        @Nullable Output<String> policy,
        @Nullable Output<String> resourceArn) {
        this.policy = policy;
        this.resourceArn = resourceArn;
    }

    private ResourcePolicyState() {
        this.policy = Output.empty();
        this.resourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;
        private @Nullable Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }

        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Output.ofNullable(resourceArn);
            return this;
        }
        public ResourcePolicyState build() {
            return new ResourcePolicyState(policy, resourceArn);
        }
    }
}
